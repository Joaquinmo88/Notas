package com.example.easynotes.easynotes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.easynotes.easynotes.dao.INotasDao;
import com.example.easynotes.easynotes.dto.ConsultarNotaDTORequest;
import com.example.easynotes.easynotes.dto.ConsultarNotaDTOResponse;
import com.example.easynotes.easynotes.models.entity.Notas;
import com.example.easynotes.easynotes.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{

	@Autowired
	private INotasDao NotasDao;

	@Override
	public ConsultarNotaDTOResponse consultarNotas(ConsultarNotaDTORequest request) {
		ConsultarNotaDTOResponse response = new ConsultarNotaDTOResponse();
		Example<Notas> example = null;
		
		try {
			if(!request.getTitle().isEmpty()) {
				example = Example.of(new Notas(request.getTitle()));
			}else {
				example = Example.of(new Notas());
			}
			List<Notas> notas = NotasDao.findAll(example);
			
			response.setNotas(notas);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return response;
	}

	@Override
	public ConsultarNotaDTOResponse consultarNotaId(ConsultarNotaDTORequest request) {
		ConsultarNotaDTOResponse response = new ConsultarNotaDTOResponse();
		
		try {	
			
			Notas nota = NotasDao.findById(request.getId()).get();
			response.setNota(nota);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}
	
	
	
}
