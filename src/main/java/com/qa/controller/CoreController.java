package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.CoreService;

@RestController
@RequestMapping("/poke")
public class CoreController {
	
	@Autowired
	private CoreService service;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public CoreController(CoreService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}
	
	public CoreController() {
	}
	
	@GetMapping("/user/{id}/poke/{name}")
	public ResponseEntity<Object> findByNumber(@PathVariable Long id, @PathVariable String number) {
		return new ResponseEntity<>(service.userIdFindPokeByName(id, number), HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}/poke/{number}")
	public ResponseEntity<Object> findByName(@PathVariable Long id, @PathVariable String number) {
		return new ResponseEntity<>(service.userIdFindPokeByNumber(id, number), HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody Object user) {
		Object newUser = service.addUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

}
