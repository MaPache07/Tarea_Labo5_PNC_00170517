package com.uca.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;

public class EstudianteServiceImpl implements EstudianteService {
	
	EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		return estudianteDAO.findAll();
	}

	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		estudianteDAO.insert(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer cUsuario) throws DataAccessException {
		estudianteDAO.delete(cUsuario);
	}
}
