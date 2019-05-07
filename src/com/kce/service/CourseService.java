package com.kce.service;

import com.kce.model.User;

public interface CourseService {

	 int dologin(String n, String pas);

	User dosignup(User use);
}
