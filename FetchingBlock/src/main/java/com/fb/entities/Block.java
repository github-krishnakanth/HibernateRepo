package com.fb.entities;

import java.io.Serializable;

public class Block implements Serializable {
	private static final long serialVersionUID = 4000443744914352990L;
	protected int blockNo;
	protected String blockName;
	protected String description;
	protected int units;
	protected int societyNo;
	
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
	public int getSocietyNo() {
		return societyNo;
	}
	public void setSocietyNo(int societyNo) {
		this.societyNo = societyNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blockName == null) ? 0 : blockName.hashCode());
		result = prime * result + blockNo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + societyNo;
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
		if (societyNo != other.societyNo)
			return false;
		if (units != other.units)
			return false;
		return true;
	 }
	@Override
	public String toString() {
		return "Block [blockNo=" + blockNo + ", blockName=" + blockName + ", description=" + description + ", units="
				+ units + ", societyNo=" + societyNo + "]";
	}
}
