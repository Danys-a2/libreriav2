package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// Inicializar el contexto de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// Obtener los beans del contexto de Spring
		FacturaDetalleDAO facturadetalleDAO = context.getBean("FacturaDetalleDAOImpl", FacturaDetalleDAO.class);
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		
		// Operaciones CRUD
		
		// add
		FacturaDetalle facturadetalle = new FacturaDetalle(0, "FAC-000903", new Date(), 70.25, 45.20, 35.24);
		facturadetalle.setFactura(facturaDAO.findOne(2));
		//facturadetalleDAO.add(facturadetalle);
		
		// up
		FacturaDetalle facturadetalle3 = new FacturaDetalle(86, "FAC-000802", new Date(), 50.362, 9.22, 29.352);
		facturadetalle3.setFactura(facturaDAO.findOne(3));
		facturadetalleDAO.up(facturadetalle3);

		// del
		facturadetalleDAO.del(86);

		// findOne
		try {
			System.out.println("**************DEL*****************" + facturadetalleDAO.findOne(86));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// findAll
		facturadetalleDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});	
		
		
		
		// Cerrar el contexto de Spring
		context.close();
	}
}