package com.citasmedicas.citasmedicas.controlador;

import java.util.ArrayList;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citasmedicas.citasmedicas.modelo.UsuarioModel;
import com.citasmedicas.citasmedicas.servicio.Usuarioservicio;

@RestController
@RequestMapping("/usuario")

@CrossOrigin(origins = "http://127.0.0.1:3000/", allowedHeaders = "*" )
public class Usuariocontrolador {
    @Autowired
    Usuarioservicio userservice;


    @GetMapping("/all")
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return userservice.getUsuario();
    }

    @GetMapping("/pacientes")
    public ArrayList<UsuarioModel> obtenerPacientes(){
        return userservice.getUsuario();
    }
    // se colocar el id como una variable en llaves
    @GetMapping("/{id}")
    public Optional<UsuarioModel> GetUsuarioByID(@PathVariable("id") int id){
        return userservice.GetUsuarioID(id);
    }

    @PostMapping("/save")
    public UsuarioModel SaveUsuarioByID(@RequestBody UsuarioModel usuario){
        return userservice.SaveUsuario(usuario);
    }

    @GetMapping("/delete/{id}")
    public void DeleteUsuarioID(@PathParam("id") int id){
        userservice.DeleteUsuario(id);
    }

    // a manera de ejemplo se pasa el metodo delete directamente de http existe(post, get, delete ...)
    @DeleteMapping("/pacientes/{id}")
    public boolean DeleteUsuarioIDBody(@PathVariable("id") int id){
        return userservice.DeleteUsuario(id);
    }


    @GetMapping("/pacientes/{id}")
    public ArrayList<UsuarioModel> GetPacientesByID(@PathVariable("id") int id){
        return userservice.getPacientes(id);
    }

    
}
