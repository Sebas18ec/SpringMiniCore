package com.login.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.login.usuarios.modelo.Fecha;

public interface FechaRepositorio extends JpaRepository<Fecha, Long>{

}
