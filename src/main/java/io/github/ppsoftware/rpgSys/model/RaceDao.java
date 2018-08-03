package io.github.ppsoftware.rpgSys.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "race")
public class RaceDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RACE_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "RACE_SEQUENCE_GENERATOR", sequenceName = "SQ_RACE")
	@Column(name = "id")
	private BigInteger id;

	@OneToOne(optional = false)
	@JoinColumn(name = "id_race_size", referencedColumnName = "id")
	private RaceSizeDao race_size;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "id_race_type", referencedColumnName = "id")
	private RaceTypeDao id_race_type;

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
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "base_speed")
	private Integer base_speed;

	@Column(name = "base_speed_fixed")
	private Boolean base_speed_fixed;
	
	@Column(name = "weight")
	private Float weight;
	
	public RaceSizeDao getRace_size() {
		return race_size;
	}

	public void setRace_size(RaceSizeDao race_size) {
		this.race_size = race_size;
	}

	public RaceTypeDao getId_race_type() {
		return id_race_type;
	}

	public void setId_race_type(RaceTypeDao id_race_type) {
		this.id_race_type = id_race_type;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBase_speed() {
		return base_speed;
	}

	public void setBase_speed(Integer base_speed) {
		this.base_speed = base_speed;
	}

	public Boolean getBase_speed_fixed() {
		return base_speed_fixed;
	}

	public void setBase_speed_fixed(Boolean base_speed_fixed) {
		this.base_speed_fixed = base_speed_fixed;
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
	
	
	
	public RaceDao() {
	}
}
