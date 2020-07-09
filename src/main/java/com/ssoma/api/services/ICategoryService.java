package com.ssoma.api.services;

import java.util.List;

import com.ssoma.api.entities.CategoryEntity;

public interface ICategoryService {
	
	List<CategoryEntity> findAll();
	
	public CategoryEntity findById(long idCategory);
	
	void save(CategoryEntity categoryE);
	
	void delete(int idCategory);
	
	
	
	

}
