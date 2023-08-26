package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The User Id to Print Details");
		int uid=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		user u=s.load(user.class,uid);
		try 
		{
			System.out.println("Id:"+u.getId());
			System.out.println("Name:"+u.getName());
			System.out.println("Phone:"+u.getPhone());
			System.out.println("Email Id:"+u.getEmail());
		} 
		catch (ObjectNotFoundException e)
		{
		System.err.println("You have Entered An Invalid Id");
		}
	}
}
