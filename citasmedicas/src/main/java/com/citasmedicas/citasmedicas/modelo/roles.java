package com.citasmedicas.citasmedicas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class roles {
    @Id
    private int idrol;
    private String descripcion;
    public roles() {
    }
    public roles(int idrol, String descripcion) {
        this.idrol = idrol;
        this.descripcion = descripcion;
    }
    public int getIdrol() {
        return idrol;
    }
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
