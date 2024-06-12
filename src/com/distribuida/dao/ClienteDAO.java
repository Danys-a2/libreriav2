package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Cliente;

public interface ClienteDAO {
	
	//son directivas o nombres de los métodos q sirven para ejecutar dentro CRUD básico
	public List<Cliente> findAll(); //atraer todos los datos
	
	public Cliente findOne(int id); //buscar un cliente
	
	public void add(Cliente cliente); //insertar un cliente
	
	public void up();                //actualizar un cliente
	
	public void del(int id);         //borrar un cliente
	
	//CRUD avanzados
	

}
