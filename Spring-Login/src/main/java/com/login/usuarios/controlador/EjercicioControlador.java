package com.login.usuarios.controlador;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.login.usuarios.modelo.Contratos;
import com.login.usuarios.modelo.Fecha;
import com.login.usuarios.servicio.ContratosServicio;
import com.login.usuarios.servicio.FechaServicio;

@Controller
public class EjercicioControlador {
	
	@Autowired
	private ContratosServicio servicio;
	
	@Autowired
	private FechaServicio serviciofecha;
	
	
	@GetMapping({"/ejercicio"})
	public String listar(Model modelo) {
		
		ArrayList<Fecha> fechas = new ArrayList<Fecha>();
		fechas = (ArrayList<Fecha>) serviciofecha.listarFechas();
		
		
		Date fechaini = serviciofecha.listarFechas().get(0).getFechaini();
		Date fechafin = serviciofecha.listarFechas().get(0).getFechafin();
		
		ArrayList<Contratos> contratos = new ArrayList<Contratos>();
		contratos = (ArrayList<Contratos>) servicio.listarContratos();
		
		ArrayList<Contratos> filtro = new ArrayList<Contratos>();
		
		
		for(int i=0;i<contratos.size();i++) {
			
			
			Date fecha = contratos.get(i).getFecha();
			
			if(fechaini.before(fecha) && fechafin.after(fecha)) {
				filtro.add(contratos.get(i));
			}
			
		}
		
		serviciofecha.eliminar();
		
		modelo.addAttribute("contratos",filtro);
		
		return "ejercicio";
	}

}
