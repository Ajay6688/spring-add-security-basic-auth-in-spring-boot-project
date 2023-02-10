package com.springcrud.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	Optional<Student> findByUsername(String username);
	
}
