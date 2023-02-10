package com.springcrud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springcrud.entity.Student;
import com.springcrud.repo.StudentRepo;

public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	private StudentRepo repo ;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("loadUserByUsername is called ");
		Optional<Student> student = repo.findByUsername(username);
		System.out.println(student);
		Student std = student.orElseThrow(()->new UsernameNotFoundException("username not found in database"));
		
		return new LoginUser(std);
	}

}
