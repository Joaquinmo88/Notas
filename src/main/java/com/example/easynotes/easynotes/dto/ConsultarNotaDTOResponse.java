package com.example.easynotes.easynotes.dto;

import java.io.Serializable;
import java.util.List;

import com.example.easynotes.easynotes.models.entity.Notas;

public class ConsultarNotaDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Notas> notas;
	private Notas nota;
	
	public List<Notas> getNotas(){
		return notas;
	}
	
	public void setNotas(List<Notas> nota) {
		this.notas = nota;
	}
	
	
	
	public Notas getNota() {
		return nota;
	}
	
	public void setNota(Notas nota) {
		this.nota = nota;
	}
}
