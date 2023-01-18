package com.login.usuarios.controlador;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.usuarios.modelo.Contratos;

import com.login.usuarios.servicio.ContratosServicio;

@Controller
public class ContratosControlador {
	
	@Autowired
	private ContratosServicio servicio;
	
	
	
	@GetMapping({"/contratos","/contratos/listar"})
	public String listarContratos(Model modelo) {
		modelo.addAttribute("contratos",servicio.listarContratos());
		return "contratos";
	}
	
	@GetMapping("/contratos/nuevo")
	public String crearContratosFormulario(Model modelo) {
		
		Contratos contrato = new Contratos();
		modelo.addAttribute("contrato",contrato);
		return "crear_contrato";
		
	}
	
	
	@PostMapping("/contratos")
	public String guardarContratos(@ModelAttribute("contratos")Contratos contrato) {
		servicio.guardarContratos(contrato);
		return "redirect:/contratos";
	}
	
	
	@GetMapping("/contratos/editar/{id}")
	public String editarContratosFormulario(@PathVariable Long id, Model modelo)
	{
		modelo.addAttribute("contrato",servicio.obtenerContratosPorId(id));
		return "editar_contrato";
	}
	
	@PostMapping("/contratos/{id}")
	public String actualizarContratos(@PathVariable Long id, @ModelAttribute("contrato")Contratos contrato, Model modelo ) {
		
		Contratos contratoExistente = servicio.obtenerContratosPorId(id);
		
		contratoExistente.setId(id);
		contratoExistente.setNombrecontratos(contrato.getNombrecontratos());
		contratoExistente.setMontos(contrato.getMontos());
		contratoExistente.setFecha(contrato.getFecha());
		
		servicio.actualizarContratos(contratoExistente);
		
		return "redirect:/contratos";
		
	}
	
	@GetMapping("/contratos/{id}")
	public String eliminarContrato(@PathVariable Long id) {
		servicio.eliminarContratos(id);
		return "redirect:/contratos";
	}
	
	
	
	

}
