package com.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long Id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Materia")
	private String materia;
	
	@Column(name = "Nota_Final")
	private double nota_final;

	public Alumno() {
		
	}

	public Alumno(long id, String nombre, String apellido, String materia, double nota_final) {
		this.Id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = materia;
		this.nota_final = nota_final;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getNota_final() {
		return nota_final;
	}

	public void setNota_final(double nota_final) {
		this.nota_final = nota_final;
	}
	
	
	

}
