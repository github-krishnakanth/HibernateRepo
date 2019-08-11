package com.mtm.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class Job implements Serializable{
	private static final long serialVersionUID = 6720541190426795084L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "job_no")
	protected int jobNo;
	protected String title;
	protected String description;
	@Column(name = "offered_salary")
	protected int offeredSalary;
	protected String location;
	
	@ManyToMany
	@JoinTable(name = "job_skills", joinColumns = {@JoinColumn(name = "job_no")}, inverseJoinColumns = {@JoinColumn(name = "skill_no")})
	protected Set<Skill> skills;

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOfferedSalary() {
		return offeredSalary;
	}

	public void setOfferedSalary(int offeredSalary) {
		this.offeredSalary = offeredSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + jobNo;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + offeredSalary;
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Job other = (Job) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (jobNo != other.jobNo)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (offeredSalary != other.offeredSalary)
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [jobNo=" + jobNo + ", title=" + title + ", description=" + description + ", offeredSalary="
				+ offeredSalary + ", location=" + location + ", skills=" + skills + "]";
	}
}
