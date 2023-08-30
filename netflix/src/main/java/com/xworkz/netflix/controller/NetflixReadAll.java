package com.xworkz.netflix.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NetflixReadAll {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createNamedQuery("ReadAll");
		List list=query.getResultList();
		System.out.println(list);
		System.out.println(list.size());
		

	}

}
