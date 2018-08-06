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
@Table(name = "races_racial_traits")
public class RaceRacialTraitDao implements Serializable {

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
	@JoinColumn(name = "id_racial_trait", referencedColumnName = "id")
	private RacialTraitDao racial_trait;
	
	@ManyToMany
	@JoinColumn(name = "id_race", referencedColumnName = "id")
	private RaceDao race;
	
	public RacialTraitDao getRacial_trait() {
		return racial_trait;
	}

	public void setRacial_trait(RacialTraitDao racial_trait) {
		this.racial_trait = racial_trait;
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

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	
	public RaceRacialTraitDao() {
	}

}