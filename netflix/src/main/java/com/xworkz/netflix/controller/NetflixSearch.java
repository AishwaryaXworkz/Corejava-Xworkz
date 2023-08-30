package com.xworkz.netflix.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.netflix.entity.NetflixEntity;

public class NetflixSearch {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println(factory);
		EntityManager manager=factory.createEntityManager();
		NetflixEntity entity=manager.find(NetflixEntity.class, 1);
		System.out.println(entity);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		entity.setEmail("aishumallesh069@gmail.com");
		entity.setAddress("mysore");
		System.out.println(entity);
		manager.merge(entity);
		transaction.commit();
		manager.close();

	}

}
