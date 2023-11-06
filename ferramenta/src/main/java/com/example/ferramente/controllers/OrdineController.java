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
import com.example.ferramenta.dtos.OrdineDTO;
import com.example.ferramenta.services.ClienteService;
import com.example.ferramenta.services.OrdineService;

@RestController
public class OrdineController {

	@Autowired
	OrdineService os;

	@GetMapping("/ordini")
	public ResponseEntity<List<OrdineDTO>> getOrdini() throws Exception {
		List<OrdineDTO> ordini = os.getAll();

		return new ResponseEntity<>(ordini, HttpStatus.OK);
	}

	@PostMapping("/ordini")
	public ResponseEntity<OrdineDTO> ordineDTO(@RequestBody OrdineDTO ordine) throws Exception {
		os.save(ordine);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
