package com.kce.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kce.model.User;
import com.mysql.cj.Query;
import com.mysql.cj.Session;

@Repository
public class CouresDAOImpl implements CouresDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int dologin(String n, String pas) {
		Query q=sessionFactory.createQuery("form user as l where l.name"+n);
		
	}

	@Override
	@Transactional
	public User dosignup(User use) {
		User ob=sessionFactory.getCurrentSession().save(use);
		return ob;
	}
	
	

}
