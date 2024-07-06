package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
	// Tipos de Relaciones en java
	
		//@OneToOne  .- 1:1
		//@OneToMany .- 1:N
		//@ManyToOne .- N:M
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_factura_detalle")
	private int idFacturaDetalle;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="subtotal")
	private double subtotal;
	//private int idFacturaDetalle;
	
	@JoinColumn(name="id_factura")
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Factura factura;    //private int idFactura;
	@JoinColumn(name="id_libro")
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Libro libro;       //private int idLibro;
	
	
	public FacturaDetalle() {}


	public FacturaDetalle(int idFacturaDetalle, int cantidad, double subtotal) {
	
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		//this.factura = factura;
		//this.libro = libro;
	}


	public FacturaDetalle(int i, String string, Date date, double d, double e, double f) {
		// TODO Auto-generated constructor stub
	}


	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}


	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	

}
