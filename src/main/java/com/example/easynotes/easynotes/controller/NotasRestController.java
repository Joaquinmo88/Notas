package com.example.easynotes.easynotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.easynotes.dto.ConsultarNotaDTORequest;
import com.example.easynotes.easynotes.dto.ConsultarNotaDTOResponse;
import com.example.easynotes.easynotes.service.NotaService;



@RestController
@RequestMapping("/notas")
public class NotasRestController {

	@Autowired
	private NotaService NotasServiceImpl;
	
	@PostMapping("/consultarnotas")
	public ConsultarNotaDTOResponse consultarNotas(@RequestBody ConsultarNotaDTORequest request) {
		return NotasServiceImpl.consultarNotas(request);
	}
	
	@GetMapping("/consultarnotas/{IdNota}")
	public ConsultarNotaDTOResponse consultarNotaId(@PathVariable String IdNota) {
		ConsultarNotaDTORequest request = new ConsultarNotaDTORequest();
		request.setId(Long.parseLong(IdNota));
		return NotasServiceImpl.consultarNotaId(request);
	}
	
	
}
