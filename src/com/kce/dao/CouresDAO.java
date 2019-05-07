package com.kce.dao;

import com.kce.model.User;

public interface CouresDAO {

	int dologin(String n, String pas);

	User dosignup(User use);
}
