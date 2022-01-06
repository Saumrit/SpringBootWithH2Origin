package com.saumrit.basicSpringbootwithH2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saumrit.basicSpringbootwithH2.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
