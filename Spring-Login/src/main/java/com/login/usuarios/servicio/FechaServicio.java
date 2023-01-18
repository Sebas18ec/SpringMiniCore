package com.login.usuarios.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.login.usuarios.modelo.Contratos;
import com.login.usuarios.modelo.Fecha;

@Service
public interface FechaServicio {
	
	public List<Fecha> listarFechas();
	
	public Fecha guardarFecha(Fecha fecha);
	
	public void eliminar();

}
