package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CompanyDto implements Serializable {

	private static final long serialVersionUID = 655159852262403024L;

	private Long id;

	private String companyCode;

	private String companyName;

	private String companyStatus;

	private String invGenType;

	private String invPrefix;

	private String companyType;

	private Long companyGroupId;

	private String companyGroupName;

	private boolean deleteFlag;

	private String typeheadDisplay;

	public String getTypeheadDisplay() {
		return this.typeheadDisplay;
	}

	public void setTypeheadDisplay(String typeheadDisplay) {
		this.typeheadDisplay = typeheadDisplay;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getCompanyGroupId() {
		return this.companyGroupId;
	}

	public void setCompanyGroupId(Long companyGroupId) {
		this.companyGroupId = companyGroupId;
	}

	public String getCompanyGroupName() {
		return this.companyGroupName;
	}

	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}

	public String getCompanyStatus() {
		return this.companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getInvGenType() {
		return this.invGenType;
	}

	public void setInvGenType(String invGenType) {
		this.invGenType = invGenType;
	}

	public String getInvPrefix() {
		return this.invPrefix;
	}

	public void setInvPrefix(String invPrefix) {
		this.invPrefix = invPrefix;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
