package com.ssoma.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssoma.api.entities.CompanyEntity;
import com.ssoma.api.services.ICompanyService;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {
	
	@Autowired
	private ICompanyService companyService;

	@GetMapping("/company")
	public List<CompanyEntity> findAll() {
		return companyService.findAll();
	}

	@PostMapping("/company")
	public CompanyEntity save(@RequestBody CompanyEntity companyE) {
		companyService.save(companyE);
		return companyE;

	}
	
	@GetMapping("/company/{id}")
	public ResponseEntity<CompanyEntity> getCompanyById(@PathVariable(value = "id") Long companyId){
	CompanyEntity company = companyService.findById(companyId);
		return ResponseEntity.ok().body(company);
}

	@PutMapping("/company")
	public CompanyEntity update(@RequestBody CompanyEntity companyE) {
		companyService.save(companyE);
		return companyE;
	}

	@DeleteMapping("/company/{id}")
	public String delete(@PathVariable("id") int idCompany) {
		companyService.delete(idCompany);
		return "Registro Eliminado.";
	}
	

}
