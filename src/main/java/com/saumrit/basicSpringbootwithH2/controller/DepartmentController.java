package com.saumrit.basicSpringbootwithH2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saumrit.basicSpringbootwithH2.entity.Department;
import com.saumrit.basicSpringbootwithH2.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	private final Logger log =LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/add")
	public Department saveDepartment(@RequestBody Department thedepartment) {
		
		log.info("Inside the save department");
		return departmentservice.saveDepartment(thedepartment);
	}
	
	@GetMapping("/demo")
	public String dummy() {	
		log.info("Inside the Dummy Method");
		return "Dummy Add";
	}
	
	@GetMapping("/getAll")
	public  List<Department> fetchalldata() {
		log.info("Inside the fetchAll department");
		return departmentservice.fetchAll();
	}
	
	@GetMapping("/get/{theid}")
	public  Department fetchonedata(@PathVariable("theid") int theid) {	
		log.info("Inside the fetchSingle department");
		return departmentservice.fetchSingleData(theid);
	}
	
	@DeleteMapping("/delete/{theid}")
	public  Department deleteonedata(@PathVariable("theid") int theid) {
		log.info("Inside the delete department");
		return departmentservice.deleteSingleData(theid);
	}
	
	
}
