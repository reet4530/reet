package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchUsebyrIdUsingHQL 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The User Id To Display Details");
		int id=sc.nextInt();
		String qry="Select u from user u where u.id=:id";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<user>q=s.createQuery(qry);
		q.setParameter("id",id);
		try 
		{
		user u=q.getSingleResult();
		System.out.println("id:"+u.getId());
		System.out.println("name:"+u.getName());
		System.out.println("Phone Numbert:"+u.getPhone());
		System.out.println("Password:"+u.getPassword());
		} 
		catch (Exception e) 
		{
			System.err.println("You Have Entered An Invalid Id");
			
		}
	}
}
