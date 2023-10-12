package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="USER_DETAILS")
public class User {
     @Id
     @Column(name="USER_ID")
	private Integer userid;
     @Column(name="USER_NAME")
	private String username;
     @Column(name="USER_GENDER")
	private String gender;
     @Column(name="USER_AGE")
	private Integer age;
     @Column(name="USER_LOCATION")
	private String location;
}
