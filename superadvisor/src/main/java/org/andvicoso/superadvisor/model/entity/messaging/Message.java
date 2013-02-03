package org.andvicoso.superadvisor.model.entity.messaging;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.user.AbstractUser;

@Entity
@Table(name = "message")
public class Message extends AbstractEntity {
	private AbstractUser from;
	private Set<AbstractUser> to;
	private String subject;
	private String text;
	private Collection<Attachment> attachments;
	private Date date;

	public AbstractUser getFrom() {
		return from;
	}

	public void setFrom(AbstractUser from) {
		this.from = from;
	}

	public Set<AbstractUser> getTo() {
		return to;
	}

	public void setTo(Set<AbstractUser> to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Collection<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(Collection<Attachment> attachments) {
		this.attachments = attachments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
