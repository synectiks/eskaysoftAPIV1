package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductCategoryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String productCategoryName;
	private boolean deleteFlag;

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCategoryName() {
		return this.productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

}
