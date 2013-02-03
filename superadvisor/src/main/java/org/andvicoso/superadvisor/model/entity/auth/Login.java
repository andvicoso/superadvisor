package org.andvicoso.superadvisor.model.entity.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Indexed
@Entity
@Table(name = "login")
public class Login {
	@Column(nullable = false)
	@Field(index = Index.YES, store = Store.NO)
	@NotEmpty(message = "O nome deve ser preenchido.")
	private String name;

	@Column(nullable = false, unique = true)
	@Field(index = Index.YES, store = Store.NO)
	@NotEmpty(message = "O e-mail deve ser preenchido.")
	@Email(message = "Digite um e-mail válido.")
	private String email;

	@Column(nullable = false)
	@NotEmpty(message = "A senha deve ser preenchida.")
	@Size(min = 5, message = "A senha deve ter pelo menos 5 caracteres")
	private String password;

	@Column(nullable = false)
	@NotNull
	private Boolean activated = false;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "O tipo de login deve ser peenchido.")
	private LoginType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public LoginType getType() {
		return type;
	}

	public void setType(LoginType type) {
		this.type = type;
	}

	public boolean isProfessor() {
		return type.equals(LoginType.PROFESSOR);
	}

	public boolean isStudent() {
		return type.equals(LoginType.STUDENT);
	}

	public boolean isAdmin() {
		return type.equals(LoginType.ADMIN);
	}
}
