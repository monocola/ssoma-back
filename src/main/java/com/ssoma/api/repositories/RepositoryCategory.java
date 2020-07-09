package com.ssoma.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssoma.api.entities.CategoryEntity;

public interface RepositoryCategory extends JpaRepository<CategoryEntity, Long> {

}
