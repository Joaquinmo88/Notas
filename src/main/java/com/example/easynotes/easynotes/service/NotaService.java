package com.example.easynotes.easynotes.service;

import com.example.easynotes.easynotes.dto.ConsultarNotaDTORequest;
import com.example.easynotes.easynotes.dto.ConsultarNotaDTOResponse;

public interface NotaService {

	public ConsultarNotaDTOResponse consultarNotas(ConsultarNotaDTORequest request);
	
	public ConsultarNotaDTOResponse consultarNotaId(ConsultarNotaDTORequest request);
	
}
