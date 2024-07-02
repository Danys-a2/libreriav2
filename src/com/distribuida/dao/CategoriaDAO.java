package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Categoria;


public interface CategoriaDAO {
	
	//son directivas o nombres de los métodos q sirven para ejecutar dentro CRUD básico.
			public List<Categoria> findAll(); //atraer todos los datos
			
			public Categoria findOne(int id); //buscar un Categoria
			
			public void add(Categoria categoria); //insertar un Categoria
			
			public void up();                //actualizar un Categoria
			
			public void del(int id);         //borrar un Categoria

			void up(Categoria categoria);
			
			//CRUD avanzados

}
