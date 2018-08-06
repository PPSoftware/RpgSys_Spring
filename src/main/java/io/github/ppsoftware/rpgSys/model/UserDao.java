package io.github.ppsoftware.rpgSys.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "users")
public class UserDao implements Serializable {

	private static final long serialVersionUID = -2257996512395408133L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "USERS_SEQUENCE_GENERATOR", sequenceName = "SQ_USERS")
	@Column(name = "id")
	private long id;

	@ManyToMany()
	@JoinColumn(name = "id_user_group", referencedColumnName = "id")
	private UserGroupDao user_group;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = false)
	private Date update_at;
	
	@Column(name = "email")
	private String email;

	@Column(name = "STATUS")
	private Status status;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public UserGroupDao getUser_group() {
		return user_group;
	}

	public void setUser_group(UserGroupDao user_group) {
		this.user_group = user_group;
	}

	public UserDao() {
	}

}