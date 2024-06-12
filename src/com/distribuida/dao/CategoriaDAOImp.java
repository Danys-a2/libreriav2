package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;


// anotaciones Spring Framework 
@Repository
public class CategoriaDAOImp implements CategoriaDAO {
	
	
	// SELECT * FROM categoria; ----------> SQL 
		// " from Categoria"   ---------------> HQL
		
		// SELECT ca * FROM categoria as ca; ------> SQL 	 
		// SELECT ca FROM Categoria ca -------------> HQL 
		
		@Autowired
		private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(" from Categoria", Categoria.class).getResultList();
	}

	@Override
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up() {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
