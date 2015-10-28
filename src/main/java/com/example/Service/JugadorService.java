package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * Created by jhipster on 6/10/15.
 */
@Service
public class JugadorService {
    @Autowired //autoinyectar (conectar) el repositorio
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;


    public void crearJugadores() {
        Calendar calendar = GregorianCalendar.getInstance();

        //EQUIPOS
        Equipo equipo01 = equipoRepository.findByNombre("Equipo1").get(0);
        Equipo equipo02 = equipoRepository.findByNombre("Equipo2").get(0);
        Equipo equipo03 = equipoRepository.findByNombre("Equipo3").get(0);
        Equipo equipo04 = equipoRepository.findByNombre("Equipo4").get(0);
        Equipo equipo05 = equipoRepository.findByNombre("Equipo5").get(0);

        //JUGADORES EQ1
        calendar.set(1995, Calendar.JANUARY, 1);
        Jugador jugador01 = new Jugador("Jugador1", calendar.getTime(), 26, 5, 8, "alero");
        jugador01.setEquipo(equipo01);
        jugadorRepository.save(jugador01);

        calendar.set(1968, Calendar.AUGUST, 21);
        Jugador jugador02 = new Jugador("Jugador2", calendar.getTime(), 9, 4, 0, "pivot");
        jugador02.setEquipo(equipo01);
        jugadorRepository.save(jugador02);

        calendar.set(1957, Calendar.OCTOBER, 27);
        Jugador jugador03 = new Jugador("Jugador3", calendar.getTime(), 20, 3, 13, "base");
        jugador03.setEquipo(equipo01);
        jugadorRepository.save(jugador03);

        calendar.set(1963, Calendar.JUNE, 9);
        Jugador jugador04 = new Jugador("Jugador4", calendar.getTime(), 3, 9, 10, "escolta");
        jugador04.setEquipo(equipo01);
        jugadorRepository.save(jugador04);

        calendar.set(1969, Calendar.SEPTEMBER, 16);
        Jugador jugador05 = new Jugador("Jugador5", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugador05.setEquipo(equipo01);
        jugadorRepository.save(jugador05);

        //JUGADORES EQ2
        calendar.set(1966, Calendar.JANUARY, 2);
        Jugador jugador06 = new Jugador("Jugador6", calendar.getTime(), 26, 5, 8, "alero");
        jugador06.setEquipo(equipo02);
        jugadorRepository.save(jugador06);

        calendar.set(1978, Calendar.FEBRUARY, 18);
        Jugador jugador07 = new Jugador("Jugador7", calendar.getTime(), 9, 4, 0, "pivot");
        jugador07.setEquipo(equipo02);
        jugadorRepository.save(jugador07);

        calendar.set(1981, Calendar.JUNE, 29);
        Jugador jugador08 = new Jugador("Jugador8", calendar.getTime(), 20, 3, 13, "base");
        jugador08.setEquipo(equipo02);
        jugadorRepository.save(jugador08);

        calendar.set(1985, Calendar.MARCH, 14);
        Jugador jugador09 = new Jugador("Jugador9", calendar.getTime(), 3, 9, 10, "escolta");
        jugador09.setEquipo(equipo02);
        jugadorRepository.save(jugador09);

        calendar.set(1982, Calendar.MAY, 9);
        Jugador jugador10 = new Jugador("Jugador10", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugador10.setEquipo(equipo02);
        jugadorRepository.save(jugador10);

        //JUGADORES EQ3
        calendar.set(1966, Calendar.JANUARY, 2);
        Jugador jugador11 = new Jugador("Jugador11", calendar.getTime(), 26, 5, 8, "alero");
        jugador11.setEquipo(equipo03);
        jugadorRepository.save(jugador11);

        calendar.set(1978, Calendar.FEBRUARY, 18);
        Jugador jugador12 = new Jugador("Jugador12", calendar.getTime(), 9, 4, 0, "pivot");
        jugador12.setEquipo(equipo03);
        jugadorRepository.save(jugador12);

        calendar.set(1914, Calendar.JUNE, 29);
        Jugador jugador13 = new Jugador("Jugador13", calendar.getTime(), 20, 3, 13, "base");
        jugador13.setEquipo(equipo03);
        jugadorRepository.save(jugador13);

        calendar.set(1914, Calendar.MARCH, 14);
        Jugador jugador14 = new Jugador("Jugador14", calendar.getTime(), 3, 9, 10, "escolta");
        jugador14.setEquipo(equipo03);
        jugadorRepository.save(jugador14);

        calendar.set(1915, Calendar.MAY, 9);
        Jugador jugador15 = new Jugador("Jugador15", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugador15.setEquipo(equipo03);
        jugadorRepository.save(jugador15);

        //JUGADORES EQ4
        calendar.set(1966, Calendar.JANUARY, 2);
        Jugador jugador16 = new Jugador("Jugador11", calendar.getTime(), 26, 5, 8, "alero");
        jugador16.setEquipo(equipo04);
        jugadorRepository.save(jugador16);

        calendar.set(1978, Calendar.FEBRUARY, 18);
        Jugador jugador17 = new Jugador("Jugador12", calendar.getTime(), 9, 4, 0, "pivot");
        jugador17.setEquipo(equipo04);
        jugadorRepository.save(jugador17);

        calendar.set(1914, Calendar.JUNE, 29);
        Jugador jugador18 = new Jugador("Jugador13", calendar.getTime(), 20, 3, 13, "base");
        jugador18.setEquipo(equipo04);
        jugadorRepository.save(jugador18);

        calendar.set(1914, Calendar.MARCH, 14);
        Jugador jugador19 = new Jugador("Jugador14", calendar.getTime(), 3, 9, 10, "escolta");
        jugador19.setEquipo(equipo04);
        jugadorRepository.save(jugador19);

        calendar.set(1915, Calendar.MAY, 9);
        Jugador jugador20 = new Jugador("Jugador15", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugador20.setEquipo(equipo04);
        jugadorRepository.save(jugador20);

        //JUGADORES EQ5
        calendar.set(1966, Calendar.JANUARY, 2);
        Jugador jugador21 = new Jugador("Jugador11", calendar.getTime(), 26, 5, 8, "alero");
        jugador21.setEquipo(equipo05);
        jugadorRepository.save(jugador21);

        calendar.set(1978, Calendar.FEBRUARY, 18);
        Jugador jugador22 = new Jugador("Jugador12", calendar.getTime(), 9, 4, 0, "pivot");
        jugador22.setEquipo(equipo05);
        jugadorRepository.save(jugador22);

        calendar.set(1914, Calendar.JUNE, 29);
        Jugador jugador23 = new Jugador("Jugador13", calendar.getTime(), 20, 3, 13, "base");
        jugador23.setEquipo(equipo05);
        jugadorRepository.save(jugador23);

        calendar.set(1914, Calendar.MARCH, 14);
        Jugador jugador24 = new Jugador("Jugador14", calendar.getTime(), 3, 9, 10, "escolta");
        jugador24.setEquipo(equipo05);
        jugadorRepository.save(jugador24);

        calendar.set(1915, Calendar.MAY, 9);
        Jugador jugador25 = new Jugador("Jugador15", calendar.getTime(), 16, 8, 2, "ala-pivot");
        jugador25.setEquipo(equipo05);
        jugadorRepository.save(jugador25);

        /*System.out.println(jugador01.toString());
        System.out.println(jugador02.toString());
        System.out.println(jugador03.toString());
        System.out.println(jugador04.toString());
        System.out.println(jugador05.toString());*/
    }

    public void consultas(){
        System.out.println("Jugadores por nombre de equipo: "+jugadorRepository.findByEquipo_Nombre("Equipo1"));
        System.out.println("Jugadores del mismo equipo y posicion: "+jugadorRepository.findByEquipoNombreAndPosicionCampoLike("Equipo2", "pivot"));
        System.out.println("Jugadores ordenados en descendiente por sus canastas: "+jugadorRepository.findFirstByOrderByCanastasTotalesDesc());
        System.out.println("5 Jugadores con más canastas y ordenados en descendiente: "+jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        //System.out.println("Jugadores de un equipo ordenados en descendiente por sus canastas: "+jugadorRepository.findByEquipoNombreCanastasDesc("Equipo2").get(0));
    }
}