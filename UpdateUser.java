package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The User Id To Update");
		int id=sc.nextInt();
		System.out.println("Enter The Name,Phone,Email And Password To Update");
		user u=new user();
		u.setId(id);
		u.setName(sc.next());
		u.setPhone(sc.nextLong());
		u.setEmail(sc.next());
		u.setPassword(sc.next());
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		s.update(u);
		Transaction t=s.beginTransaction();
		t.commit();	
	}

}
