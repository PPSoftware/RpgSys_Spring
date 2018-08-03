package io.github.ppsoftware.rpgSys.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "audit")
public class AuditDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUDIT_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "AUDIT_SEQUENCE_GENERATOR", sequenceName = "SQ_AUDIT")
	@Column(name = "id")
	private BigInteger id;

	@OneToOne(optional = true)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private UserDao user;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date createdTime;

	@Column(name = "action")
	private String action;
	
	@Column(name = "controller")
	private String controller;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}


	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	public AuditDao() {
	}
}
