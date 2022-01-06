package com.saumrit.basicSpringbootwithH2.service;

import java.util.List;

import com.saumrit.basicSpringbootwithH2.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department thedepartment);
	
	public  List<Department> fetchAll();

	public Department fetchSingleData(int id);

	public Department deleteSingleData(int theid);
	
	
}
