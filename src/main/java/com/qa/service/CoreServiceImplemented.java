package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImplemented implements CoreService {

	@Autowired
	private RestTemplate rest;

	public String addUser(Object user) {
		String addUserRequest = rest.postForObject("http://localhost:8081/user/addUser/", user, String.class);
		return addUserRequest;
	}

	public String userIdFindPokeByName(Long id, String name) {
		String userRequest = rest.getForObject("http://localhost:8081/user/getUser/" + id, String.class);
		String pokeRequest = rest.getForObject("http://localhost:8082/source/PokeByName/" + name, String.class);

		// if user request returns 500 internal sever error
		// print user does not exist

		return pokeRequest;
	}

	public String userIdFindPokeByNumber(Long id, String number) {
		String userRequest = rest.getForObject("http://localhost:8081/user/getUser/" + id, String.class);
		String pokeRequest = rest.getForObject("http://localhost:8082/source/PokeByNumber/" + number, String.class);

		// if user request returns 500 internal sever error
		// print user does not exist

		return pokeRequest;
	}

}
