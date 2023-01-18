package com.login.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.usuarios.modelo.Contratos;

import com.login.usuarios.repositorio.ContratosRepositorio;


@Service
public class ContratosServicioImpl implements ContratosServicio{

	
	@Autowired
	private ContratosRepositorio repositorio;
	
	@Override
	public List<Contratos> listarContratos() {
		
		return repositorio.findAll();
	}


	@Override
	public Contratos guardarContratos(Contratos contrato) {
		return repositorio.save(contrato);
		
	}

	@Override
	public Contratos obtenerContratosPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Contratos actualizarContratos(Contratos contrato) {
		return repositorio.save(contrato);
		
	}

	@Override
	public void eliminarContratos(Long id) {
		repositorio.deleteById(id);
		
	}

	
}
