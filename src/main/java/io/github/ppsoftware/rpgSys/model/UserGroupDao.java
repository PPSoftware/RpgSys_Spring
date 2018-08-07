package io.github.ppsoftware.rpgSys.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "users_groups")
public class UserGroupDao implements Serializable {

	private static final long serialVersionUID = -2257996512395408133L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_GROUPS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "USERS_GROUPS_SEQUENCE_GENERATOR", sequenceName = "SQ_USERS_GROUPS")
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;


	@Column(name = "STATUS")
	private Status status;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = true)
	private Date update_at;
	
	
    private Set<UserDao> users;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
    @ManyToMany(mappedBy = "userGroups")
    public Set<UserDao> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDao> users) {
        this.users = users;
    }

	public UserGroupDao() {
	}

}