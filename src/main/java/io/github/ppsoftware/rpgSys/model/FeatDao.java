package io.github.ppsoftware.rpgSys.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "feats")
public class FeatDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FEATS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "FEATS_SEQUENCE_GENERATOR", sequenceName = "SQ_FEATS")
	@Column(name = "id")
	private BigInteger id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", updatable = false)
	private Date updated_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@Column(name = "name")
	private String name;
	
	@Column(name = "benefit")
	private String benefit;
	
	@Column(name = "normal")
	private String normal;
	
	@Column(name = "requirement")
	private String requirement;
	
	
	@OneToOne(optional = true)
	@JoinColumn(name = "id_reference_book", referencedColumnName = "id")
	private ReferenceBookDao referenceBook;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public ReferenceBookDao getReferenceBook() {
		return referenceBook;
	}

	public void setReferenceBook(ReferenceBookDao referenceBook) {
		this.referenceBook = referenceBook;
	}

	public FeatDao() {
	}
}
