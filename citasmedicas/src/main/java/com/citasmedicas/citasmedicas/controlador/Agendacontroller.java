package com.citasmedicas.citasmedicas.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citasmedicas.citasmedicas.modelo.AgendaModel;
import com.citasmedicas.citasmedicas.servicio.Agendaservice;

@RestController
@RequestMapping("/agenda")
public class Agendacontroller {
    @Autowired
    Agendaservice servicioagenda;


    @GetMapping()
    public ArrayList<AgendaModel> traerAgendas(){
        return servicioagenda.ObtenerAgendas();
    }

    // construir bien el traer medicos queda pendiente
    //@GetMapping("/medicos" )
    //@GetMapping(path="medicos/{id}")
    //public ArrayList<AgendaModel> traerAgendaMedicos(@PathVariable("id") Integer id){


    //}



}
