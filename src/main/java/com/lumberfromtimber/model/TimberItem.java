package com.lumberfromtimber.model;

import java.util.Date;

public class TimberItem {
	
	private int itemID;
	private String itemName;
	private String discription;
	private String dimension;
	private Double unitPrice;
	private Date cretaedDate;
	private Date lastUpdateDate;
	private int createdBy;
	private Date lastUpdatedBy;
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getCretaedDate() {
		return cretaedDate;
	}
	public void setCretaedDate(Date cretaedDate) {
		this.cretaedDate = cretaedDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(Date lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	
	

}
