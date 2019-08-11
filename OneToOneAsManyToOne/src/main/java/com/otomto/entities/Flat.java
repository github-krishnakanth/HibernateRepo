package com.otomto.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flat")
public class Flat implements Serializable {
	private static final long serialVersionUID = -7217074843402276068L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flat_no")
	protected int flatNo;
	@Column(name = "flat_type")
	protected String flatType;
	protected String description;
	protected String facing;
	protected int sqft;
	protected String status;
	
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String facing) {
		this.facing = facing;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((facing == null) ? 0 : facing.hashCode());
		result = prime * result + flatNo;
		result = prime * result + ((flatType == null) ? 0 : flatType.hashCode());
		result = prime * result + sqft;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (facing == null) {
			if (other.facing != null)
				return false;
		} else if (!facing.equals(other.facing))
			return false;
		if (flatNo != other.flatNo)
			return false;
		if (flatType == null) {
			if (other.flatType != null)
				return false;
		} else if (!flatType.equals(other.flatType))
			return false;
		if (sqft != other.sqft)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Flat [flatNo=" + flatNo + ", flatType=" + flatType + ", description=" + description + ", facing="
				+ facing + ", sqft=" + sqft + ", status=" + status + "]";
	} 
}
