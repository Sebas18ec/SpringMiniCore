package com.login.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.usuarios.modelo.Contratos;
import com.login.usuarios.modelo.Fecha;
import com.login.usuarios.servicio.FechaServicio;

@Controller
public class FechaControlador {

	@Autowired
	private FechaServicio serviciofecha;
	
	@GetMapping("/fechasfiltro")
	public String fechas(Model modelo) {
		//modelo.addAttribute("fecha",serviciofecha.listarFechas());
		modelo.addAttribute("fechaList", serviciofecha.listarFechas());
	    modelo.addAttribute("fecha", new Fecha());
		return "fecha";
		
	}
	
	@PostMapping("/fechas")
	public String guardarFecha(@ModelAttribute("fechas")Fecha fecha) {
		serviciofecha.guardarFecha(fecha);
		return "redirect:/ejercicio";
	}
	

}
