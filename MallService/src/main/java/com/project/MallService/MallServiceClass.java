package com.project.MallService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.*;

@Service
@Transactional
public class MallServiceClass {
	@Autowired
	private MallServiceRepository repo;

	public List<MallClass> listAll() {
		return repo.findAll();
	}

	public void save(MallClass  employe) {
		repo.save(employe);
	}

	public MallClass  get(Integer emp_id) {
		return repo.findById(emp_id).get();
	}

	public void delete(Integer emp_id) {
		repo.deleteById(emp_id);
	}
}
