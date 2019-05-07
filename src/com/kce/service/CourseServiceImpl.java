package com.kce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kce.dao.CouresDAO;
import com.kce.model.User;

@Service("cservice")
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CouresDAO cdao;

	@Override
	@Transactional
	public int dologin(String n, String pas) 
	{
		int flag=0;
		if(dologin(n,pas))
		{
			flag=1;
		}
		flag=0;
		return flag;
	}

	@Override
	public User dosignup(User use) {
		if(cdao.dosignup(use) != null)
		{
			return use;
		}
		return null;
	}
	

}
