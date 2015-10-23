package com.example.Service;

import com.example.Model.*;
import com.example.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 23/10/15.
 */
@Service
public class TemporadaService {
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void crearTemporada(){
        Calendar calendar = GregorianCalendar.getInstance();

        Liga liga = ligaRepository.findByNombre("ACB").get(0);

        Equipo equipo1 = equipoRepository.findByNombre("Equipo1").get(0);
        Equipo equipo2 = equipoRepository.findByNombre("Equipo2").get(0);
        Equipo equipo3 = equipoRepository.findByNombre("Equipo3").get(0);
        Equipo equipo4 = equipoRepository.findByNombre("Equipo4").get(0);
        Equipo equipo5 = equipoRepository.findByNombre("Equipo5").get(0);

        calendar.set(2014, Calendar.JANUARY, 1);
        Temporada temporada1 = new Temporada (calendar.getTime());
        temporada1.setLiga(liga);
        temporada1.getEquipos().add(equipo1);
        temporada1.getEquipos().add(equipo3);
        temporadaRepository.save(temporada1);

        calendar.set(2015, Calendar.JANUARY, 1);
        Temporada temporada2 = new Temporada(calendar.getTime());
        temporada2.setLiga(liga);
        temporada2.getEquipos().add(equipo2);
        temporada2.getEquipos().add(equipo4);
        temporada2.getEquipos().add(equipo5);
        temporadaRepository.save(temporada2);

        System.out.println(temporada1.toString());
        System.out.println(temporada2.toString());
    }

}
