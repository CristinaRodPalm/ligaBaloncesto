package com.example.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by jhipster on 6/10/15.
 */

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long identificador;
    @Column
    private String nombre;
    @Column
    private Date fechaNacimiento;
    @Column
    private int canastasTotales;
    @Column
    private int asistenciasTotales;
    @Column
    private int rebotesTotales;
    @Column
    private String posicionCampo;

    public Jugador(){

    }

    public Jugador(String nombre, Date fecha, int canastas, int asistencias, int rebotes, String posicion) {
        this.setNombre(nombre);
        this.setFechaNacimiento(fecha);
        this.setCanastasTotales(canastas);
        this.setAsistenciasTotales(asistencias);
        this.setRebotesTotales(rebotes);
        this.setPosicionCampo(posicion);
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCanastasTotales() {
        return canastasTotales;
    }

    public void setCanastasTotales(int canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public int getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public void setAsistenciasTotales(int asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public String getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    public int getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(int rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", canastasTotales=" + canastasTotales +
                ", asistenciasTotales=" + asistenciasTotales +
                ", rebotesTotales=" + rebotesTotales +
                ", posicionCampo='" + posicionCampo + '\'' +
                '}';
    }
}
