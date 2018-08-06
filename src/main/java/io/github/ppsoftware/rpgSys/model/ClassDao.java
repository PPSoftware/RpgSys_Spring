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
@Table(name = "classes")
public class ClassDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHARACTER_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "CHARACTER_SEQUENCE_GENERATOR", sequenceName = "SQ_CHARACTER")
	@Column(name = "id")
	private BigInteger id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "skill_modifier_per_level", referencedColumnName = "id")
	private Integer SkillModifierPerLevel;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "id_race", referencedColumnName = "id")
	private RaceDao race;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@Column(name = "name")
	private String name;
	
	@Column(name = "hit_die")
	private Integer hitDie;
	
	@Column(name = "starting_wealth_die")
	private String startingWealthDie;
	
	@Column(name = "starting_wealth_pieces")
	private Integer startingWealthPieces;
	
	@Column(name = "skill_points_per_level")
	private Integer skillPointsPerLevel;
	
	
	@Column(name = "status")
	private Status status;
	
	
	@Column(name = "id_reference_book")
	private ReferenceBookDao referenceBook;
	


	public BigInteger getId() {
		return id;
	}



	public void setId(BigInteger id) {
		this.id = id;
	}

	
	public Integer getSkillModifierPerLevel() {
		return SkillModifierPerLevel;
	}



	public void setSkillModifierPerLevel(Integer skillModifierPerLevel) {
		SkillModifierPerLevel = skillModifierPerLevel;
	}



	public RaceDao getRace() {
		return race;
	}



	public void setRace(RaceDao race) {
		this.race = race;
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



	public Integer getHitDie() {
		return hitDie;
	}



	public void setHitDie(Integer hitDie) {
		this.hitDie = hitDie;
	}



	public String getStartingWealthDie() {
		return startingWealthDie;
	}



	public void setStartingWealthDie(String startingWealthDie) {
		this.startingWealthDie = startingWealthDie;
	}



	public Integer getStartingWealthPieces() {
		return startingWealthPieces;
	}



	public void setStartingWealthPieces(Integer startingWealthPieces) {
		this.startingWealthPieces = startingWealthPieces;
	}



	public Integer getSkillPointsPerLevel() {
		return skillPointsPerLevel;
	}



	public void setSkillPointsPerLevel(Integer skillPointsPerLevel) {
		this.skillPointsPerLevel = skillPointsPerLevel;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public ReferenceBookDao getReferenceBook() {
		return referenceBook;
	}



	public void setReferenceBook(ReferenceBookDao referenceBook) {
		this.referenceBook = referenceBook;
	}



	public ClassDao() {
	}
}
