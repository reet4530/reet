package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchuserBYName 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The User Name To Display Details");
	String name=sc.next();
	String qry="Select u From user u where u.name=?1";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<user>q=s.createQuery(qry);
	q.setParameter(1, name);
	List<user>users=q.getResultList();
	if(users.size()>0)
	{
		for(user u:users)
		{
			System.out.println("nd:"+u.getId());
			System.out.println("Name;"+u.getName());
			System.out.println("phone Number:"+u.getPhone());
			System.out.println("Email Id:"+u.getEmail());
			System.out.println("-----*****-----");
		}	
	}
	else
	{
		System.out.println("No User Found With The Entered Name ");
	}
}
}
