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
@Table(name = "character")
public class CharacterDao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHARACTER_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "CHARACTER_SEQUENCE_GENERATOR", sequenceName = "SQ_CHARACTER")
	@Column(name = "id")
	private BigInteger id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private UserDao user;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "id_race", referencedColumnName = "id")
	private RaceDao race;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date created_at;

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "height")
	private Float height;
	
	@Column(name = "weight")
	private Float weight;
	
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
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}
	
	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
	
	public UserDao getUser() {
		return user;
	}

	public void setUser(UserDao user) {
		this.user = user;
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

	public CharacterDao() {
	}
}