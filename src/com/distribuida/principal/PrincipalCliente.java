package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.ClienteDAOImp;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Patron IoC Inversion de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImp",ClienteDAO.class);
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		clientes.forEach(item -> {
			System.out.println(item.toString());
		});
		
		
		context.close();
		
	}

}
