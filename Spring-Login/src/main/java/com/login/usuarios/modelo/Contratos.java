package com.login.usuarios.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contratos")
public class Contratos {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombrecontratos")
	private String nombrecontratos;
	
	@Column(name = "montos")
	private int montos;
	
	@Column(name = "fecha")
	private Date fecha;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNombrecontratos() {
		return nombrecontratos;
	}

	public void setNombrecontratos(String nombrecontratos) {
		this.nombrecontratos = nombrecontratos;
	}

	public int getMontos() {
		return montos;
	}

	public void setMontos(int montos) {
		this.montos = montos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	
}
