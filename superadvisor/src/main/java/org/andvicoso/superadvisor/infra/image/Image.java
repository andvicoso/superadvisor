package org.andvicoso.superadvisor.infra.image;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.andvicoso.superadvisor.infra.util.NumberUtils;

@Entity
@Table(name = "image")
public class Image {

	private static List<String> IMG_TYPES = Arrays.asList("png", "jpeg", "jpg",
			"gif");

	// 5 mb
	public static final long MAX_FILE_SIZE = 5242880;

	public static Long getIdFromUrl(String url) {
		Long result = null;

		if (url != null) {
			int begin = url.lastIndexOf("/");
			int end = url.indexOf(".", begin);

			String id = url.substring(begin + 1, end);

			if (NumberUtils.isNumber(id)) {
				result = Long.valueOf(id);
			}
		}

		return result;
	}

	public static String getImageUrl(Image image) {
		return "images/" + image.getId() + "." + image.getType();
	}

	public static String getTypeFromUrl(String urlParam) {
		int begin = urlParam.lastIndexOf("/");
		int end = urlParam.indexOf(".", begin);
		return urlParam.substring(end + 1, urlParam.length());
	}

	@Id
	@GeneratedValue
	private Long id;

	@Lob
	@Column(length = (int) MAX_FILE_SIZE)
	@NotNull
	private byte[] bytes;

	@NotNull
	private String mimeType;

	@Column(nullable = false)
	// , unique = true
	private String name;

	public InputStream getAsStream() {
		return bytes != null ? new ByteArrayInputStream(bytes) : null;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public Long getId() {
		return id;
	}

	public String getMimeType() {
		return mimeType;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return getType(mimeType);
	}

	public static String getType(String pMimeType) {
		int begin = pMimeType.indexOf("/");
		int length = pMimeType.length();
		return pMimeType.substring(begin + 1, length);
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static boolean isImage(String pMimeType) {
		return IMG_TYPES.contains(getType(pMimeType));
	}
}
