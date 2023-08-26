package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindUserById 
{
	public static void main(String[] args) 
	{
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The User Id To Display Details");
	int id=sc.nextInt();
	user u=s.get(user.class,id);
	if(u!=null)
	{
	System.out.println("User Id:"+u.getId());	
	System.out.println("Name:"+u.getName());
	System.out.println("Phone:"+u.getPhone());
	System.out.println("Email:"+u.getEmail());
	}
	else 
	{
		System.err.println("You Have Entered ");
	}
	}
}
