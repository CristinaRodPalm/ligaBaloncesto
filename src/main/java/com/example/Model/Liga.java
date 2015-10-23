package com.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 23/10/15.
 */
@Entity
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column

    private Long identificador;
    @Column
    private String nombre;

    @OneToMany(mappedBy = "liga") // solo en modo lectura!
    private Set<Temporada> temporadas = new HashSet<>();

    public Liga(){

    }

    public Liga(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Temporada> getTemporadas() {  return temporadas;  }

    public void setTemporadas(Set<Temporada> temporadas) {  this.temporadas = temporadas;  }

    @Override
    public String toString() {
        return "Liga{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
