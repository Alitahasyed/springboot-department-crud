// Java Program to Illustrate DepartmentRepository File

// Importing package module to this code
package com.crud.crudforlearn.repository;
// Importing required classes
import com.crud.crudforlearn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}