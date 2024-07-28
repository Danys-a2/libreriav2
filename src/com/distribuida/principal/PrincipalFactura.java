package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImp", ClienteDAO.class);
		// CRUD
		
		// add
		Factura factura = new Factura(0, "FAC-00070",new Date(), 20.36, 5.2, 26.35); 
		factura.setCliente(clienteDAO.findOne(2));
		//facturaDAO.add(factura);
		// up
		Factura factura2 = new Factura(36, "FAC-000702",new Date(), 20.362, 5.22, 26.352); 
		factura2.setCliente(clienteDAO.findOne(36));
		facturaDAO.up(factura2);		
		// del
		//facturaDAO.del(83); 
		//findOne
		try { System.out.println("**************DEL*****************"+ facturaDAO.findOne(86));} catch(Exception e) {e.printStackTrace();}
		// findAll
		facturaDAO.findAll().forEach(item -> { System.out.println(item.toString());} );
		
		
				
		
		context.close();

	}

}
