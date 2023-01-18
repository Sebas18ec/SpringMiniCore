package com.login.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.usuarios.modelo.Contratos;


public interface ContratosRepositorio extends JpaRepository<Contratos, Long>{

}
