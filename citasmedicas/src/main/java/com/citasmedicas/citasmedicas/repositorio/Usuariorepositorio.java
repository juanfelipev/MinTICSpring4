package com.citasmedicas.citasmedicas.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citasmedicas.citasmedicas.modelo.UsuarioModel;
@Repository
public interface Usuariorepositorio extends CrudRepository<UsuarioModel,Integer> {
    public abstract ArrayList <UsuarioModel> findByRolEquals(int rol);

    public abstract ArrayList <UsuarioModel> findByRol(int rol);

}
