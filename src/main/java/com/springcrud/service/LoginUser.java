package com.springcrud.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springcrud.entity.Student;

public class LoginUser implements UserDetails {
	
	final private Student std;
	
	@Autowired
	public LoginUser(Student std) {
		this.std = std;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println("inside getAuthorities method of LoginUser class");
		return List.of(()->"read");
	}

	@Override
	public String getPassword() {
		System.out.println("inside getPassword of Login User Class ");
		
		return std.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println("inside getUsername of Login User Class ");

		return std.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		System.out.println("inside isAccountNonExpired method of LoginUser class");
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		System.out.println("inside isAccountNonLocked method of LoginUser class");
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		System.out.println("inside isCredentialsNonExpired method of LoginUser class");
		return true;
	}

	@Override
	public boolean isEnabled() {
		System.out.println("inside isEnabled method of LoginUser class");
		// TODO Auto-generated method stub
		return true;
	}

}
