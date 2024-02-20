package com.project.MallService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class MallControllerClass {
	@Autowired
	private MallServiceClass service;

	@GetMapping("/employeeservice")
	public java.util.List<MallClass> list() {
		return service.listAll();
	}

	@GetMapping("/employeeservice/{emp_id}")
	public ResponseEntity<MallClass> get(@PathVariable Integer emp_id) {
		try {
			MallClass employee = service.get(emp_id);
			return new ResponseEntity<MallClass>(employee, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<MallClass>(HttpStatus.NOT_FOUND);
		}
	}

	
	@PostMapping("/employeeservice")
	public void add(@RequestBody MallClass employee) {
		service.save(employee);
	}


	@PutMapping("/employeeservice/{emp_id}")
	public ResponseEntity<?> update(@RequestBody MallClass employee, @PathVariable Integer emp_id) {

		MallClass existemployeeservice = service.get(emp_id);
		service.save(employee);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/employeeservice/{emp_id}")
	public void delete(@PathVariable Integer emp_id) {
		service.delete(emp_id);
	}
}