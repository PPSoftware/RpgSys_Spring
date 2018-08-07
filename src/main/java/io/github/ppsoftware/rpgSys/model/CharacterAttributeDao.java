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
@Table(name = "character_feats")
public class CharacterAttributeDao implements Serializable {

	private static final long serialVersionUID = -2257996512395408133L;


	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", updatable = true)
	private Date update_at;
	
	@ManyToMany
	@JoinColumn(name = "id_character", referencedColumnName = "id")
	private CharacterDao character;
	
	@ManyToMany
	@JoinColumn(name = "id_attribute", referencedColumnName = "id")
	private AttributeDao attributeDao;

	@Column(name = "value")
	private Integer value;

	@Column(name = "temporary_value")
	private Integer temporaryValue;	
	
	
	
	public CharacterDao getCharacter() {
		return character;
	}

	public void setCharacter(CharacterDao character) {
		this.character = character;
	}

	public AttributeDao getAttributeDao() {
		return attributeDao;
	}

	public void setAttributeDao(AttributeDao attributeDao) {
		this.attributeDao = attributeDao;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getTemporaryValue() {
		return temporaryValue;
	}

	public void setTemporaryValue(Integer temporaryValue) {
		this.temporaryValue = temporaryValue;
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


	public CharacterAttributeDao() {
	}

}