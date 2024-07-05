package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Patron IoC Inversion de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
						
		AutorDAO autorDAO = context.getBean("autorDAOImp",AutorDAO.class);
		//CRUD
		//add
		Autor autor = new Autor(0, "pamela","castro","ecuador","av. cerca de aqui","0964512540","pcastro@correo.com");
		//autorDAO.add(autor);				
		// up
		Autor autor2 = new Autor(54, "maria","melo","colombia","av. mas alla","0964512520","mmelo@correo.com");
	    autorDAO.up(autor2);				
		// del
		//autorDAO.del(1);
		//try {System.out.println("****************DEL***************"+autorDAO.findOne(1)); }catch(Exception e) {e.printStackTrace();}
		//findOne
		//System.out.println("****************DEL***************"+autorDAO.findOne(1));				
		// find All				
		autorDAO.findAll().forEach(item -> {System.out.println(item.toString()); });
				
		
		context.close();
			
		
	}

}
