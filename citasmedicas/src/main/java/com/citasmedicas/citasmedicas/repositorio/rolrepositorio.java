package com.citasmedicas.citasmedicas.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citasmedicas.citasmedicas.modelo.roles;

@Repository
public interface rolrepositorio extends CrudRepository<roles,Integer>{
    public class Innerrolrepositorio {
    
        
    }

}
