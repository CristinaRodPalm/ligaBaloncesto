package com.example.Model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 23/10/15.
 */
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column

    private Long identificador;
    @Column
    private Date anyo;
    @ManyToOne //una liga tiene varias temporadas
    private Liga liga;

    @ManyToMany (mappedBy = "temporadas")
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada(){ }

    public Temporada(Date anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "identificador=" + identificador +
                ", anyo=" + anyo +
                ", liga=" + liga +
                ", equipos=" + equipos +
                '}';
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public Date getAnyo() {
        return anyo;
    }

    public void setAnyo(Date anyo) {
        this.anyo = anyo;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }
}