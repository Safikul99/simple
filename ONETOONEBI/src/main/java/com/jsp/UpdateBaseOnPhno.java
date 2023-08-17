package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateBaseOnPhno 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	     Query query=entityManager.createQuery("select c from Company c where c.phno=?2");
	     query.setParameter(2, 8240030196l);
	     List<Company>companys=query.getResultList();
	     
	     for (Company company : companys) 
	     {
	    	 company.setLocation("KOLKATA");
	    	 entityTransaction.begin();
	    	 entityManager.merge(company);
	    	 entityTransaction.commit();
			
		}
	     
	     
		
	     
	}

}
