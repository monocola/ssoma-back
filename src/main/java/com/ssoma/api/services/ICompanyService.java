package com.ssoma.api.services;

import java.util.List;

import com.ssoma.api.entities.CompanyEntity;


public interface ICompanyService {
	
	List<CompanyEntity> findAll();
	
	public CompanyEntity findById(long idCompany);
	
	void save(CompanyEntity companyE);
	
	void delete(int idCompany);

}
