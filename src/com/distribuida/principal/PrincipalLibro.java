package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static void main(String[] args) {
		// Inicializar el contexto de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// Obtener los beans del contexto de Spring
		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		// Operaciones CRUD
		//new Libro(0, "Libro Title 1", new Date(), 15.36, 7.2, 37.352);
		// add
		Libro libro = new Libro(0,"Libro Title 1", new Date(), 15.36, 7.2, 37.352);
		libro.setAutor(autorDAO.findOne(2));
		libro.setCategoria(categoriaDAO.findOne(1)); // Asegurarse de que el método setCategoria esté en la clase Libro
		//libroDAO.add(libro);
		
		// up
		Libro libro4 = new Libro(86, "Libro Title 2", new Date(), 40.362, 7.22, 27.352); 
		libro4.setAutor(autorDAO.findOne(3));
		libro.setCategoria(categoriaDAO.findOne(2));
		//libroDAO.up(libro4);		
		
		// del
		//libroDAO.del(86);
		
		// findOne
		try { 
			System.out.println("**************DEL*****************" + libroDAO.findOne(86));
		} catch(Exception e) {
			e.printStackTrace();
		}

		// findAll
		libroDAO.findAll().forEach(item -> { 
			System.out.println(item.toString());
		});	
		
		
		// Cerrar el contexto de Spring
		context.close();
	}
}