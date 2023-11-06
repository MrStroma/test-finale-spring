package com.example.ferramente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ferramenta.dtos.ClienteDTO;
import com.example.ferramenta.services.ClienteService;



@RestController
public class ClienteController {
	
	
	
	@Autowired
	ClienteService cs;

	@GetMapping("/clienti")
	public ResponseEntity<List<ClienteDTO>> getClienti() throws Exception {
		List<ClienteDTO> clienti = cs.getAll();

		return new ResponseEntity<>(clienti, HttpStatus.OK);
	}

	@PostMapping("/cliente")
	public ResponseEntity<ClienteDTO> addCliente(@RequestBody ClienteDTO cliente) throws Exception {
		cs.save(cliente);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
