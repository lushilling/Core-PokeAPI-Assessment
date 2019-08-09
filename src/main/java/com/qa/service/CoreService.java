package com.qa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CoreService {
	
	ResponseEntity<Object> addUser(Object user);
	ResponseEntity<Object> userIdFindPokeByName(Long id, String name);
	ResponseEntity<Object> userIdFindPokeByNumber(Long id, String number);

}
