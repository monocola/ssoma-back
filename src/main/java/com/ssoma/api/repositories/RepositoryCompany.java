package com.ssoma.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssoma.api.entities.CompanyEntity;

public interface RepositoryCompany extends JpaRepository<CompanyEntity, Long> {

}
