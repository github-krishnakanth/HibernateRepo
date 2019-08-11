package com.slc.entities;

import java.io.Serializable;

public class Flat implements Serializable {
	private static final long serialVersionUID = 845648754384527903L;
	
	private int flatNo;
	private String description;
	private String flatType;
	private int sqft;
	private String facing;
	private int floorStatus;
	
	private Block block;

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public int getSqft() {
		return sqft;
	}

	public void setSqft(int sqft) {
		this.sqft = sqft;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public int getFloorStatus() {
		return floorStatus;
	}

	public void setFloorStatus(int floorStatus) {
		this.floorStatus = floorStatus;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block == null) ? 0 : block.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((facing == null) ? 0 : facing.hashCode());
		result = prime * result + flatNo;
		result = prime * result + ((flatType == null) ? 0 : flatType.hashCode());
		result = prime * result + floorStatus;
		result = prime * result + sqft;
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
		if (block == null) {
			if (other.block != null)
				return false;
		} else if (!block.equals(other.block))
			return false;
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
		if (floorStatus != other.floorStatus)
			return false;
		if (sqft != other.sqft)
			return false;
		return true;
	}
}
