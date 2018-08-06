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
public class FeatAttributeDependecyDao implements Serializable {

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
	@JoinColumn(name = "id_attribute", referencedColumnName = "id")
	private AttributeDao attribute;
	
	@ManyToMany
	@JoinColumn(name = "id_feat", referencedColumnName = "id")
	private FeatDao feat;

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public AttributeDao getAttribute() {
		return attribute;
	}

	public void setAttribute(AttributeDao attribute) {
		this.attribute = attribute;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}


	public FeatDao getFeat() {
		return feat;
	}

	public void setFeat(FeatDao feat) {
		this.feat = feat;
	}

	public FeatAttributeDependecyDao() {
	}

}