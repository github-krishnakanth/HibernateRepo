package com.mtm.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member implements Serializable {
	private static final long serialVersionUID = 9098336779917404293L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "member_no")
	protected int memberNo;
	@Column(name = "member_name")
	protected String memberName;
	@Column(name = "contact_no")
	protected String contactNo;
	@Column(name = "email_address")
	protected String emailAddress;
	
	@ManyToMany
	@MapKeyColumn(name = "member_responsibility_name", nullable = true)
	@JoinTable(name = "member_responsibilities", joinColumns = {@JoinColumn(name = "member_no")}, inverseJoinColumns = {@JoinColumn(name = "responsibility_no")})
	protected Map<String, Responsibility> memberResponsibilities;

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memeberName) {
		this.memberName = memeberName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Map<String, Responsibility> getMemberResponsibilities() {
		return memberResponsibilities;
	}

	public void setMemberResponsibilities(Map<String, Responsibility> memberResponsibilities) {
		this.memberResponsibilities = memberResponsibilities;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((memberResponsibilities == null) ? 0 : memberResponsibilities.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + memberNo;
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
		Member other = (Member) obj;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (memberResponsibilities == null) {
			if (other.memberResponsibilities != null)
				return false;
		} else if (!memberResponsibilities.equals(other.memberResponsibilities))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (memberNo != other.memberNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [memeberNo=" + memberNo + ", memeberName=" + memberName + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + ", memberResponsibilities=" + memberResponsibilities + "]";
	}
}
