package com.citasmedicas.citasmedicas.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citasmedicas.citasmedicas.modelo.roles;
import com.citasmedicas.citasmedicas.servicio.rolservicio;

@RestController
// si llega una peticion get con la url rol entonces lo que hace es llamar una funcion del servicio.
@RequestMapping("/rol")
public class rolcontrolador {
    //autowired lo que hace es entende que lo que viene va a ser una instancia de una clase.
    @Autowired
    rolservicio rolservicio;
    @GetMapping()
    public ArrayList<roles> obtenerRepositorios1(){
        return rolservicio.obtenerRepositorios();
    }
}
