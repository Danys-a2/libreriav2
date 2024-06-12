package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;


//anotaciones Spring Framework
@Repository
public class AutorDAOImp implements AutorDAO {
	
	// SELECT * FROM Autor; ----------> SQL 
		// " from Autor"   ---------------> HQL
		
		// SELECT au * FROM autor as au; ------> SQL 	 
		// SELECT au FROM Autor au -------------> HQL 
		
		@Autowired
		private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(" from Autor", Autor.class).getResultList();
	}

	@Override
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Autor autor) {
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
