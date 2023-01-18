package com.login.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.usuarios.modelo.Fecha;
import com.login.usuarios.repositorio.FechaRepositorio;

@Service
public class FechaServicioImpl implements FechaServicio{

	@Autowired
	FechaRepositorio repositorio;
	
	@Override
	public Fecha guardarFecha(Fecha fecha) {
		return repositorio.save(fecha);
		
	}

	@Override
	public List<Fecha> listarFechas() {
		return repositorio.findAll();
	}

	@Override
	public void eliminar() {
		repositorio.deleteAll();
		
	}

}
