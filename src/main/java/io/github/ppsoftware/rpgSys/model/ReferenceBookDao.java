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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REFERENCE_BOOK_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "REFERENCE_BOOK_SEQUENCE_GENERATOR", sequenceName = "SQ_REFERENCE")
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

	@Column(name = "book")
	private String book;
	
	@Column(name = "acronym")
	private String acronym;
	
	

	public ReferenceBookDao() {
	}
}
