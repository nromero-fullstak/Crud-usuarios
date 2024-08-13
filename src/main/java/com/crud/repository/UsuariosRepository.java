package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<usuario, Integer>{

}
