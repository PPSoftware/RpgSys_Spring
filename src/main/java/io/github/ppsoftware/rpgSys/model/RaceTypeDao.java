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
@Table(name = "race_type")
public class RaceTypeDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RACE_TYPE_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "RACE_TYPE_SEQUENCE_GENERATOR", sequenceName = "SQ_RACE_TYPE")
	@Column(name = "id")
	private BigInteger id;


	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = false)
	private Date update_at;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "hit_die")
	private Integer hitDie;
	
	@Column(name = "skill_rank_base")
	private Integer skillRankBase;
	
	@Column(name = "base_atack_bonus_modifier")
	private Float baseAtackBonusModifier;

	@Column(name = "status")
	private Integer stratus;
	
	public BigInteger getId() {
		return id;
	}




	public void setId(BigInteger id) {
		this.id = id;
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




	public Integer getSkillRankBase() {
		return skillRankBase;
	}




	public void setSkillRankBase(Integer skillRankBase) {
		this.skillRankBase = skillRankBase;
	}




	public Float getBaseAtackBonusModifier() {
		return baseAtackBonusModifier;
	}




	public void setBaseAtackBonusModifier(Float baseAtackBonusModifier) {
		this.baseAtackBonusModifier = baseAtackBonusModifier;
	}




	public Integer getStratus() {
		return stratus;
	}




	public void setStratus(Integer stratus) {
		this.stratus = stratus;
	}




	

	
	
	public RaceTypeDao() {
	}
}
