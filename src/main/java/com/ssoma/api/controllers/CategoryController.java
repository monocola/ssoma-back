package com.ssoma.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssoma.api.entities.CategoryEntity;
import com.ssoma.api.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin({"http://localhost:4200"})
public class CategoryController {

	@Autowired
	private ICategoryService categoryService;

	@GetMapping("/categories")
	public List<CategoryEntity> findAll() {
		return categoryService.findAll();
	}

	@PostMapping("/categories")
	public CategoryEntity save(@RequestBody CategoryEntity categoryE) {
		categoryService.save(categoryE);
		return categoryE;

	}

	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryEntity> getCategoryById(@PathVariable(value = "id") Long categoryId){
	CategoryEntity category = categoryService.findById(categoryId);
		return ResponseEntity.ok().body(category);
}

	@PutMapping("/categories")
	public CategoryEntity update(@RequestBody CategoryEntity categoryE) {
		categoryService.save(categoryE);
		return categoryE;
	}

	@DeleteMapping("/categories/{id}")
	public String delete(@PathVariable("id") int idCategory) {
		categoryService.delete(idCategory);
		return "Registro Eliminado.";
	}

}
