package com.citasmedicas.citasmedicas.repositorio;

//import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citasmedicas.citasmedicas.modelo.AgendaModel;

@Repository
public interface Agendarepositorio extends CrudRepository<AgendaModel,Integer>{
    //public abstract ArrayList<AgendaModel> find;
}
