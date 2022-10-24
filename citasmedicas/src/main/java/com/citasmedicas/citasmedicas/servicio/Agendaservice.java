package com.citasmedicas.citasmedicas.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasmedicas.citasmedicas.modelo.AgendaModel;
import com.citasmedicas.citasmedicas.repositorio.Agendarepositorio;

@Service
public class Agendaservice {
    @Autowired
    Agendarepositorio Agendas;

    public ArrayList<AgendaModel> ObtenerAgendas(){
        return (ArrayList<AgendaModel>)Agendas.findAll();
    }
/* 
    public ArrayList<AgendaModel> ObgenerAgendaMedicos(Integer ident){
        return (ArrayList<AgendaModel>)Agendas.findByMedicos(ident);
    }*/
}
