package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class usuario {	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id;
	private String nombre;
	private String clave;
	
	
	
	public usuario() {
		super();
	}
	public usuario(Integer id, String nombre, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "usuario [id=" + id + ", nombre=" + nombre + ", clave=" + clave + "]";
	}
	
	
	
}
