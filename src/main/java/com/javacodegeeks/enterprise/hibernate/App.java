package com.javacodegeeks.enterprise.hibernate;

import org.hibernate.Session;
import com.javacodegeeks.enterprise.hibernate.utils.HibernateUtil;

public class App
{
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Student student = new Student();

		student.setStudentName("aaaaaa");
		student.setStudentAge("14222");

		session.save(student);
		session.getTransaction().commit();
		System.out.println("Great! Student was saved");

//		int id = 2;
//		session.beginTransaction();
//		
//		for (int i = 3; i < 6; i++)
//		{
//			student = (Student) session.get(Student.class, i);
//			session.delete(student);
//		}		
//		
//		session.getTransaction().commit();
//		System.out.println("Great! Student id 2 was delete");
	}
}