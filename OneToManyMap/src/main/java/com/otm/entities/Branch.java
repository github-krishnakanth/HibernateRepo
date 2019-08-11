package com.otm.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch implements Serializable {
	private static final long serialVersionUID = 4526067895926041936L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "branch_no")
	protected int branchNo;
	@Column(name = "bank_nm")
	protected String bankName;
	@Column(name = "branch_nm")
	protected String branchName;
	protected String location;
	@Column(name = "ifsc_code")
	protected String ifscCode;
	@OneToMany
	@JoinColumn(name = "branch_no")
	@MapKeyColumn(name = "cheque_tx_no", nullable = true)
	protected Map<String, Cheque> chequeMap;
	
	public int getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Map<String, Cheque> getChequeMap() {
		return chequeMap;
	}
	public void setChequeMap(Map<String, Cheque> chequeMap) {
		this.chequeMap = chequeMap;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + branchNo;
		result = prime * result + ((chequeMap == null) ? 0 : chequeMap.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		Branch other = (Branch) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (branchNo != other.branchNo)
			return false;
		if (chequeMap == null) {
			if (other.chequeMap != null)
				return false;
		} else if (!chequeMap.equals(other.chequeMap))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", bankName=" + bankName + ", branchName=" + branchName + ", location="
				+ location + ", ifscCode=" + ifscCode + ", chequeMap=" + chequeMap + "]";
	}
}
