package com.login.usuarios.servicio;

import java.util.List;

import com.login.usuarios.modelo.Contratos;


public interface ContratosServicio {
	
	public List<Contratos> listarContratos();
	
	public Contratos guardarContratos(Contratos contrato);
	
	public Contratos obtenerContratosPorId(Long id);
	
	public Contratos actualizarContratos(Contratos contrato);
	
	public void eliminarContratos(Long id);

}
