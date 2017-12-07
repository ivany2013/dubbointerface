package com.xl.service;

import com.xl.entity.User;


public interface DemoService {
	 public String sayHello(String name);
	 public User findUserById(Long id);
}
