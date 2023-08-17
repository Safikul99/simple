package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavaData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("TCS");
		company.setWebsite("www.TCS255.com");
		company.setLocation("Kolkata");
		company.setPhno(8240030196l);
		
		Company company1=new Company();
		company1.setName("Infosys");
		company1.setWebsite("www.Infosys255.com");
		company1.setLocation("Bangalor");
		company1.setPhno(8650030100l);
		
		Gst gst=new Gst();
		gst.setGstno("gsttcs356");
		gst.setState("WestBangal");
		gst.setCountry("India");
		
		Gst gst1=new Gst();
		gst1.setGstno("gstinfosys87");
		gst1.setState("karnataka1");
		gst1.setCountry("India");
		
		company.setGsts(gst);
		company1.setGsts(gst1);
		
		gst.setCompanys(company);
		gst1.setCompanys(company1);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(company1);
		entityManager.persist(gst);
		entityManager.persist(gst1);
		entityTransaction.commit();
		
		
		
	}

}
