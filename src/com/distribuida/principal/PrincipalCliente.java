package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;

import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Patron IoC Inversion de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImp",ClienteDAO.class);
		
		//CRUD
		//add
		Cliente cliente = new Cliente(0, "1759638659","juan","taipe","av. por ahi y mas alla.","099863253","jtaipe@correo.com");
		//clienteDAO.add(cliente);		
		// up
		Cliente cliente2 = new Cliente(1, "1759638652","juan2","taipe2","av. por ahi y mas alla.2","099863252","jtaipe2@correo.com");
		clienteDAO.up(cliente2);		
		// del 
		//clienteDAO.del(1);
		//findOne
		//System.out.println("****************DEL***************"+clienteDAO.findOne(1));
		//try {System.out.println("****************DEL***************"+clienteDAO.findOne(1)); }catch(Exception e) {e.printStackTrace();}		
		// find All
		clienteDAO.findAll().forEach(item -> {System.out.println(item.toString()); });
		
		
		context.close();
		
	}

}
