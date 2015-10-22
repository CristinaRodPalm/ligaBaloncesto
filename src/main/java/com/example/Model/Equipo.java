package com.example.Model;

import com.example.Model.Jugador;import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import javax.persistence.OneToMany;
import java.lang.Long;import java.lang.Override;import java.lang.String;import java.util.*;import java.util.Date;import java.util.HashSet;import java.util.Set;

//ok
/**
 * Created by jhipster on 12/10/15.
 */

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long identificador;
    @Column
    private String nombre;
    @Column
    private String localidad;
    @Column
    private Date fechaCreacion;

    public Equipo(){

    }

    public Equipo(String nombre, String localidad, Date fechaCreacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "equipo") // solo en modo lectura!
    private Set<Jugador> jugadores = new HashSet<>();

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}