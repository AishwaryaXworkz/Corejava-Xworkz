package com.xworkz.netflix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="netflix_info")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="ReadAll",query="select entity from NetflixEntity entity")
public class NetflixEntity {
	
@Id	
@Column(name="n_id")
private int id;

@Column(name="n_userName")
private String userName;

@Column(name="n_password")
private String password;

@Column(name="n_email")
private String email;

@Column(name="n_address")
private String address;

@Column(name="n_price")
private int price;

@Column(name="n_phoneNumber")
private long phoneNumber;

}
