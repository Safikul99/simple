package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataBaseOnPhno 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	     Query query=entityManager.createQuery("select c from Company c where c.phno=?1");
	     query.setParameter(1, 8240030196l);
	     List<Company>company=query.getResultList();
	     for (Company company2 : company) 
	     {
	    	 System.out.println("the company id:"+company2.getId());
	    	 System.out.println("the company name:"+company2.getName());
	    	 System.out.println("the company website:"+company2.getWebsite());
	    	 System.out.println("the company location:"+company2.getLocation());
	    	 System.out.println("the company phno:"+company2.getPhno());
	    	 System.out.println("===================================");
			 Gst gst=company2.getGsts();
			 System.out.println(gst.getId());
			 System.out.println(gst.getGstno());
			 System.out.println(gst.getCountry());
		}
	     
	     
		
	     
	}

}
