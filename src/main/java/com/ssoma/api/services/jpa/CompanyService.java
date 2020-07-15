package com.ssoma.api.services.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssoma.api.entities.CompanyEntity;
import com.ssoma.api.repositories.RepositoryCompany;
import com.ssoma.api.services.ICompanyService;

@Service
public class CompanyService implements ICompanyService {
	
	@Autowired
	private RepositoryCompany repositoryCompany;

	@Override
	public List<CompanyEntity> findAll() {
		return repositoryCompany.findAll();
	}

	@Override
	public CompanyEntity findById(long idCompany) {
		Optional<CompanyEntity> optional = repositoryCompany.findById(idCompany);
		if(optional.isPresent()) {	
		return optional.get();
	}
		return null;
	}

	@Override
	public void save(CompanyEntity companyE) {
		repositoryCompany.save(companyE);

	}

	@Override
	public void delete(int idCompany) {
		repositoryCompany.deleteById((long) idCompany);

	}

}
