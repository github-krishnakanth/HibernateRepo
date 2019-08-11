package com.otm.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "an_block")
public class Block implements Serializable {
	private static final long serialVersionUID = -9213021967081143908L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "block_no")
	protected int blockNo;
	@Column(name = "block_name")
	protected String blockName;
	protected String description;
	protected int units;
	
	@OneToMany
	@JoinColumn(name = "block_no")
	protected Set<Flat> flats;

	public int getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Set<Flat> getFlats() {
		return flats;
	}

	public void setFlats(Set<Flat> flats) {
		this.flats = flats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blockName == null) ? 0 : blockName.hashCode());
		result = prime * result + blockNo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((flats == null) ? 0 : flats.hashCode());
		result = prime * result + units;
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
		Block other = (Block) obj;
		if (blockName == null) {
			if (other.blockName != null)
				return false;
		} else if (!blockName.equals(other.blockName))
			return false;
		if (blockNo != other.blockNo)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (flats == null) {
			if (other.flats != null)
				return false;
		} else if (!flats.equals(other.flats))
			return false;
		if (units != other.units)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Block [blockNo=" + blockNo + ", blockName=" + blockName + ", description=" + description + ", units="
				+ units + ", flats=" + flats + "]";
	}
}
