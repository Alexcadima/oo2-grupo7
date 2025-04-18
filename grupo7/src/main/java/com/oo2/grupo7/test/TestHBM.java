package com.oo2.grupo7.test;

import org.hibernate.Session;

import com.oo2.grupo7.dao.HibernateUtil;

public class TestHBM {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
		System.out.println("OK");

	}

}
