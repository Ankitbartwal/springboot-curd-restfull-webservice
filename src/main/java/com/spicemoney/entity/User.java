package com.spicemoney.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
@Table(name="users")
public class User {

	@Id     //let define primary key for our table
	@GeneratedValue(strategy = GenerationType.AUTO)  //primary key genaration strategy
	private Long Id;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public User(Long id, String firstName, String lastName, String email) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	
	
}
