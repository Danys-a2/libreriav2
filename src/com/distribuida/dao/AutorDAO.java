package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;



public interface AutorDAO {
	
	//son directivas o nombres de los métodos q sirven para ejecutar dentro CRUD básico
		public List<Autor> findAll(); //atraer todos los datos
		
		public Autor findOne(int id); //buscar un Autor
		
		public void add(Autor autor); //insertar un Autor
		
		public void up();                //actualizar un Autor
		
		public void del(int id);         //borrar un Autor
		
		//CRUD avanzados

}
