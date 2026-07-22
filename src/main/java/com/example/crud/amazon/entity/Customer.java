package com.example.crud.amazon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cusinfo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="last_name",nullable=false)
	private String lastName;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="city",nullable=false)
	private String city;
	@Column(name="state",nullable=false)
	private String state;

}
