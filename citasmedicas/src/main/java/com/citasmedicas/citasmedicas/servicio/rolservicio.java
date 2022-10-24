package com.citasmedicas.citasmedicas.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasmedicas.citasmedicas.modelo.roles;
import com.citasmedicas.citasmedicas.repositorio.rolrepositorio;

@Service
public class rolservicio {
    @Autowired
    rolrepositorio repositoriorol;

    public ArrayList<roles> obtenerRepositorios(){
        return (ArrayList<roles>)repositoriorol.findAll();
    }
}
