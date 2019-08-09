package com.qa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CoreServiceImplemented implements CoreService {

	public ResponseEntity<Object> addUser(Object user) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Object> userIdFindPokeByName(Long id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Object> userIdFindPokeByNumber(Long id, String number) {
		// TODO Auto-generated method stub
		return null;
	}

//	User Story: As a user, I want the system to inform me when I am trying to search for a Pokemon with a user that does not exist.
	
}
