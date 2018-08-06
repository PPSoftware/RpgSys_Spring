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
@Table(name = "character_classes")
public class CharacterClassDao implements Serializable {

	private static final long serialVersionUID = -2257996512395408133L;


	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = false)
	private Date update_at;
	
	@ManyToMany
	@JoinColumn(name = "id_class", referencedColumnName = "id")
	private ClassDao characterClass;
	
	@ManyToMany
	@JoinColumn(name = "id_character", referencedColumnName = "id")
	private CharacterDao character;
	
	@Column(name = "training_value")
	private Integer trainingValue;
	
	@Column(name = "is_trained")
	private Boolean isTrained;

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

	
	public ClassDao getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(ClassDao characterClass) {
		this.characterClass = characterClass;
	}


	public CharacterDao getCharacter() {
		return character;
	}

	public void setCharacter(CharacterDao character) {
		this.character = character;
	}

	public Integer getTrainingValue() {
		return trainingValue;
	}

	public void setTrainingValue(Integer trainingValue) {
		this.trainingValue = trainingValue;
	}

	public Boolean getIsTrained() {
		return isTrained;
	}

	public void setIsTrained(Boolean isTrained) {
		this.isTrained = isTrained;
	}

	public CharacterClassDao() {
	}

}