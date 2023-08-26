package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PrintNames {
	public static void main(String[] args) {
		String qry = "Select u.name from user u";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<String> q = s.createQuery(qry);
		List<String> names = q.getResultList();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
