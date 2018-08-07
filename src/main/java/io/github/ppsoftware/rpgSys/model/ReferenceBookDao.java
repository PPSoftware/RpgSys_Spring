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
@Table(name = "references_books")
public class ReferenceBookDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REFERENCES_BOOKS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "REFERENCES_BOOKS_SEQUENCE_GENERATOR", sequenceName = "SQ_REFERENCES_BOOKS")
	@Column(name = "id")
	private BigInteger id;


	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", updatable = false)
	private Date updated_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = true)
	private Date created_at;

	@Column(name = "book")
	private String book;
	
	@Column(name = "abbreviation")
	private String abbreviation;
	

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



	public String getBook() {
		return book;
	}



	public void setBook(String book) {
		this.book = book;
	}



	public String getAbbreviation() {
		return abbreviation;
	}



	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}



	public ReferenceBookDao() {
	}
}
