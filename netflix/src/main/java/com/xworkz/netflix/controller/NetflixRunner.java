package com.xworkz.netflix.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.netflix.entity.NetflixEntity;

public class NetflixRunner {

	public static void main(String[] args) {
		NetflixEntity entity=new NetflixEntity(1,"aishu","aish","aishu@gmail.com","vijayanagar",500,9740322295l);
		NetflixEntity entity1=new NetflixEntity(2,"ganavi","gan","ganavi@gmail.com","peenya",1000,984563635l);
		NetflixEntity entity2=new NetflixEntity(3,"ashwini","ash","ash@gmail.com","rajajinagar",1500,9986968578l);
		System.out.println("this is the main method");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println(factory);
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		transaction.commit();
		manager.close();


	}

}
