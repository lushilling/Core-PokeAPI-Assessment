package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {
	
	String addUser(Object user);
	String userIdFindPokeByName(Long id, String name);
	String userIdFindPokeByNumber(Long id, String number);

}
