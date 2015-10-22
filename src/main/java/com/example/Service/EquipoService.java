package com.example.Service;

import com.example.Model.*;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.System;import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 15/10/15.
 */
@Transactional
@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void crearEquipos() {
        Calendar calendar = GregorianCalendar.getInstance();

        //CREACIÓN DE LOS 5 EQUIPOS
        calendar.set(1998, Calendar.JANUARY, 1);
        Equipo equipo1 = new Equipo("Equipo1", "Barcelona", calendar.getTime());
        equipoRepository.save(equipo1);

        calendar.set(2000, Calendar.DECEMBER, 28);
        Equipo equipo2 = new Equipo("Equipo2", "Valencia", calendar.getTime());
        equipoRepository.save(equipo2);

        calendar.set(2003, Calendar.AUGUST, 12);
        Equipo equipo3 = new Equipo("Equipo3", "Madrid", calendar.getTime());
        equipoRepository.save(equipo3);

        calendar.set(1999, Calendar.JUNE, 17);
        Equipo equipo4 = new Equipo("Equipo4", "Galicia", calendar.getTime());
        equipoRepository.save(equipo4);

        calendar.set(2001, Calendar.AUGUST, 9);
        Equipo equipo5 = new Equipo("Equipo5", "Sevilla", calendar.getTime());
        equipoRepository.save(equipo5);

        System.out.println(equipo1.toString());
        System.out.println(equipo2.toString());
        System.out.println(equipo3.toString());
        System.out.println(equipo4.toString());
        System.out.println(equipo5.toString());
    }

}
