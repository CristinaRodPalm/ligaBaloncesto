package com.example.Service;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by jhipster on 6/10/15.
 */
@Service
public class JugadorService {
    @Autowired //autoinyectar (conectar) el repositorio
    private JugadorRepository jugadorRepository;
   

    public void testJugador() {
        Calendar calendar = GregorianCalendar.getInstance();

        //1. DAR DE ALTA 5 JUGADORES
        calendar.set(1995, Calendar.JANUARY, 1);
        Jugador jugador1 = new Jugador("Jugador1", calendar.getTime(), 26, 5, 8, "alero");
        jugadorRepository.save(jugador1);

        calendar.set(1968, Calendar.AUGUST, 21);
        Jugador jugador2 = new Jugador("Jugador2", calendar.getTime(), 9, 4, 0, "pivot");
        jugadorRepository.save(jugador2);

        calendar.set(1957, Calendar.OCTOBER, 27);
        Jugador jugador3 = new Jugador("Jugador3", calendar.getTime(), 20, 3, 13, "base");
        jugadorRepository.save(jugador3);

        calendar.set(1963, Calendar.JUNE, 9);
        Jugador jugador4 = new Jugador("Jugador4", calendar.getTime(), 3, 9, 10, "escolta");
        jugadorRepository.save(jugador4);

        calendar.set(2001, Calendar.SEPTEMBER, 16);
        Jugador jugador5 = new Jugador("Jugador5", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugadorRepository.save(jugador5);

        System.out.println("Encontrar por nombre empezando por...");
        System.out.println(jugadorRepository.findByNombreStartingWith("Jug"));
        System.out.println("Canastas igual o mejor a...");
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(8));
        System.out.println("Asistencias entre...");
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(2, 9));
        System.out.println("Posicion igual a...");
        System.out.println(jugadorRepository.findByPosicionCampoLike("escolta"));
        calendar.set(2000, Calendar.FEBRUARY, 8);
        System.out.println("Nacimiento antes de...");
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(calendar.getTime()));
        calendar.set(1993, Calendar.JUNE, 22);
        System.out.println("Canastas igual o mayores a y nacimiento ante de...");
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(10, calendar.getTime()));

        //añado un comentario de prueba
        //77
    }

}
