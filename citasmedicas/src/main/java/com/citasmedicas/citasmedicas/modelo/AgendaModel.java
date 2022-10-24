package com.citasmedicas.citasmedicas.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agenda")
public class AgendaModel {
    @Id
    private int idagenda;

    private Date fecha;
    private int idmedico;
    private int idfranja;

    public AgendaModel() {
    }
    
    public AgendaModel(Date fecha_agenda, int id_medico, int id_franja) {
        this.fecha= fecha_agenda;
        this.idmedico = id_medico;
        this.idfranja = id_franja;
    }
    public int getId_agenda() {
        return idagenda;
    }
    public void setId_agenda(int id_agenda) {
        this.idagenda = id_agenda;
    }
    public Date getFecha_agenda() {
        return fecha;
    }
    public void setFecha_agenda(Date fecha_agenda) {
        this.fecha = fecha_agenda;
    }
    public int getId_medico() {
        return idmedico;
    }
    public void setId_medico(int id_medico) {
        this.idmedico = id_medico;
    }
    public int getId_franja() {
        return idfranja;
    }
    public void setId_franja(int id_franja) {
        this.idfranja = id_franja;
    }

    
}
