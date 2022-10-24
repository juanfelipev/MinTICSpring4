package com.citasmedicas.citasmedicas.servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasmedicas.citasmedicas.modelo.UsuarioModel;
import com.citasmedicas.citasmedicas.repositorio.Usuariorepositorio;

@Service
public class Usuarioservicio {
    @Autowired
    Usuariorepositorio Usuariorepositorio;
    
    public ArrayList<UsuarioModel> getUsuario (){
        return (ArrayList<UsuarioModel>) Usuariorepositorio.findAll();

    }

    public ArrayList<UsuarioModel> getPacientes (int p){
        return (ArrayList<UsuarioModel>) Usuariorepositorio.findByRolEquals(p);

    }

    public Optional <UsuarioModel> GetUsuarioID(int id){
        return Usuariorepositorio.findById(id);
    }

    public UsuarioModel SaveUsuario(UsuarioModel paciente){
        return Usuariorepositorio.save(paciente);
    }

    public boolean DeleteUsuario(int id){

        if(Usuariorepositorio.existsById(id)){
            Usuariorepositorio.deleteById(id);
            return true;

        }else{
            return false;
        }
    }


    

}
