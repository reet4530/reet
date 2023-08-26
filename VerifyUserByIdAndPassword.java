package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyUserByIdAndPassword
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The User Id And Password To verify");
		int id=sc.nextInt();
		String password=sc.next();
		String qry="Select u from user u where u.id=?1 And u.password=?2";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<user>q=s.createQuery(qry);
		q.setParameter(1,id);
		q.setParameter(2,password);
		try
		{
			user u=q.getSingleResult();
			System.out.println("id:"+u.getId());
			System.out.println("name:"+u.getName());
			System.out.println("phone Number:"+u.getPhone());
			System.out.println("password:"+u.getPassword());
		} 
		catch (Exception e) 
		{
			System.out.println("You Have Entered An Invalid Id And Password");
			
		}
}
}