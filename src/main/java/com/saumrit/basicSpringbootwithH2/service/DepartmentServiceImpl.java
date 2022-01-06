package com.saumrit.basicSpringbootwithH2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saumrit.basicSpringbootwithH2.entity.Department;
import com.saumrit.basicSpringbootwithH2.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository therepository;
	
	public Department saveDepartment(Department thedepartment) {		
		return therepository.save(thedepartment);
	}

	public List<Department> fetchAll() {		
		return therepository.findAll();
	}

	@Override
	public Department fetchSingleData(int id) {		
		 Optional<Department> theData = therepository.findById(id);
		 if(theData.isPresent())
			 return theData.get();
		 else
			 return null;
	}

	@Override
	public Department deleteSingleData(int theid) {
		Optional<Department> theData = therepository.findById(theid);
		 if(theData.isPresent())
			 therepository.deleteById(theid);
		 else
			 return null;		
		return theData.get();
	}
	
	

}
