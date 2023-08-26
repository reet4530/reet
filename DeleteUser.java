package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser 
{
	public static void main(String[] args)
	{
 Session s=new Configuration().configure().buildSessionFactory().openSession();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The User Id To delete The record");
 int id=sc.nextInt();
 user u=s.get(user.class, id);
 Transaction t=s.beginTransaction();
 if(u!=null)
 {
	 s.delete(u);
	 t.commit();
 }
 else
 {
	 System.out.println("you Have Entered An Invalid Value");
 }
	}
}
