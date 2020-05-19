package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager em;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.estudiante");
		Query query = em.createNativeQuery(sb.toString(), Estudiante.class);
		List<Estudiante> res = query.getResultList();
		return res;
	}

	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		em.persist(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer cUsuario) throws DataAccessException {
		Estudiante estudiante = em.find(Estudiante.class, cUsuario);
		if(estudiante != null)
			em.remove(estudiante);
	}
}
