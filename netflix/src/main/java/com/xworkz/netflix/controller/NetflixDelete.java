package com.xworkz.netflix.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.netflix.entity.NetflixEntity;

public class NetflixDelete {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		NetflixEntity entity=manager.find(NetflixEntity.class,3);
		System.out.println(entity);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.remove(entity);
		transaction.commit();
		manager.close();

	}

}
