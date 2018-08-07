package io.github.ppsoftware.rpgSys.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "races_sizes")
public class RaceSizeDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RACES_SIZES_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "RACES_SIZES_SEQUENCE_GENERATOR", sequenceName = "SQ_RACES_SIZES")
	@Column(name = "id")
	private BigInteger id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = true)
	private Date update_at;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public RaceSizeDao() {
	}
}
