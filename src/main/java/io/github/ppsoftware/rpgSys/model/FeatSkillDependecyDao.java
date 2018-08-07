package io.github.ppsoftware.rpgSys.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "feats_skills_dependecies")
public class FeatSkillDependecyDao implements Serializable {

	private static final long serialVersionUID = -2257996512395408133L;
	
	@Column(name = "value")
	private Integer value;
	
	@ManyToMany
	@JoinColumn(name = "id_skill", referencedColumnName = "id")
	private SkillDao skill;
	
	@ManyToMany
	@JoinColumn(name = "id_feat", referencedColumnName = "id")
	private FeatDao feat;


	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public SkillDao getSkill() {
		return skill;
	}

	public void setSkill(SkillDao skill) {
		this.skill = skill;
	}

	public FeatDao getFeat() {
		return feat;
	}

	public void setFeat(FeatDao feat) {
		this.feat = feat;
	}

	public FeatSkillDependecyDao() {
	}

}