package com.thursdaylab;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		// creating Library
		Library l1 = new Library();
		l1.setLibraryId(101);
		l1.setLibraryName("Central");

		// creating books
		Books b1 = new Books();
		b1.setBookId(10);
		b1.setBookName("java");

		Books b2 = new Books();
		b2.setBookId(11);
		b2.setBookName("sql");

		Books b3 = new Books();
		b3.setBookId(14);
		b3.setBookName("hibernate");

		Books b4 = new Books();
		b4.setBookId(26);
		b4.setBookName("spring");

		List<Books> books = new ArrayList<Books>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		l1.setBooks(books);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// save
		s.save(l1);
		s.save(b1);
		s.save(b2);
		s.save(b3);
		s.save(b4);

		tx.commit();

		session.close();
		factory.close();

	}
}
