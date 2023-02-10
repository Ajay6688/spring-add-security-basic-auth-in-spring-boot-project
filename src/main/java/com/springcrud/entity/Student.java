package com.springcrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column(name="username")
	private String username ; 
	
	@Column(name="password")
	private String password ;

	public int getId() {
		System.out.println("inside getId of entity");
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setId of entity");
		this.id = id;
	}

	public String getUsername() {
		System.out.println("inside getUsername of Entity class");
		return username;
	}

	public void setUsername(String username) {
		System.out.println("inside setUsername of entity");
		this.username = username;
	}

	public String getPassword() {
		System.out.println("inside getPassword of Entity class");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("inside setpassword of entity");
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
