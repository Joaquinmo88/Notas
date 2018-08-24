package com.example.easynotes.easynotes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.example.easynotes.easynotes.models.entity.Notas;

public interface INotasDao extends JpaRepository<Notas, Long>, QueryByExampleExecutor<Notas>{

}
