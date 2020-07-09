package com.ssoma.api.services.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssoma.api.entities.CategoryEntity;
import com.ssoma.api.repositories.RepositoryCategory;
import com.ssoma.api.services.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private RepositoryCategory repositoryCategory;
	
	@Override
	public List<CategoryEntity> findAll() {
		return repositoryCategory.findAll();
	}

	@Override
	public void save(CategoryEntity categoryE) {
		repositoryCategory.save(categoryE);
		
	}

	@Override
	public void delete(int idCategory) {
		repositoryCategory.deleteById((long) idCategory);
		
	}

	@Override
	public CategoryEntity findById(long idCategory) {
		Optional<CategoryEntity> optional = repositoryCategory.findById(idCategory);
		if(optional.isPresent()) {	
		return optional.get();
	}
		return null;
	}

}
