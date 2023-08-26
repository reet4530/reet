package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveuser
{
	public static void main(String[] args) 
	{
		user u=new user();
		u.setEmail("rst@gmail.com");
		u.setName("RST Yadav");
		u.setPassword("rst123");
		u.setPhone(45632231);
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		int id=(Integer)s.save(u);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("User Registed With Id:"+id);
	}
}