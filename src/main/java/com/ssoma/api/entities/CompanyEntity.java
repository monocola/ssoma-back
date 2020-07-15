package com.ssoma.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String documentType;
	
	@Column(nullable = false)
	private String number;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String activityType;
	
	@Column(nullable = false)
	private Integer yearBeginning;
	
	@Column(nullable = false)
	private String broker;
	
	@Column(nullable = false)
	private String service;
	
	@Column(nullable = false)
	private boolean customerMain;
	

	public CompanyEntity() {
		
	}
	
	

	public CompanyEntity(Long id, String documentType, String number, String address, String activityType,
			Integer yearBeginning, String broker, String service, boolean customerMain) {
		super();
		this.id = id;
		this.documentType = documentType;
		this.number = number;
		this.address = address;
		this.activityType = activityType;
		this.yearBeginning = yearBeginning;
		this.broker = broker;
		this.service = service;
		this.customerMain = customerMain;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Integer getYearBeginning() {
		return yearBeginning;
	}

	public void setYearBeginning(Integer yearBeginning) {
		this.yearBeginning = yearBeginning;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public boolean isCustomerMain() {
		return customerMain;
	}

	public void setCustomerMain(boolean customerMain) {
		this.customerMain = customerMain;
	}

	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", documentType=" + documentType + ", number=" + number + ", address="
				+ address + ", activityType=" + activityType + ", yearBeginning=" + yearBeginning + ", broker=" + broker
				+ ", service=" + service + ", customerMain=" + customerMain + "]";
	}
	
	
	
	
}
