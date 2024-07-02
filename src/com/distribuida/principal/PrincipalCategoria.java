package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Patron IoC Inversion de Control
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
				CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImp",CategoriaDAO.class);
				//CRUD
				//add
				Categoria categoria = new Categoria(0, "programacion","en esta categoria estan los libros de programacion 1 y 2");
				categoriaDAO.add(categoria);				
				// up
				Categoria categoria2 = new Categoria(1, "matematicas","en esta categoria estan los libros de analisis 1 y 2");
				categoriaDAO.up(categoria2);				
				// del
				categoriaDAO.del(1);
				//findOne
				//System.out.println("****************DEL***************"+categoriaDAO.findOne(1));
				try {System.out.println("****************DEL***************"+categoriaDAO.findOne(1)); }catch(Exception e) {e.printStackTrace();}				
				// find All
				categoriaDAO.findAll().forEach(item -> {System.out.println(item.toString()); });
				
				
				context.close();
		
		
		
		
		
	}

}
