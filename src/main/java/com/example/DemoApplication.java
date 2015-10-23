package com.example;

import com.example.Service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class DemoApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    private static TemporadaService temporadaService;
    private static LigaService ligaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        jugadorService = context.getBean(JugadorService.class);
        equipoService = context.getBean(EquipoService.class);
        temporadaService = context.getBean(TemporadaService.class);
        ligaService = context.getBean(LigaService.class);


        ligaService.crearLiga();
        temporadaService.crearTemporada();
        equipoService.crearEquipos();
        jugadorService.testJugador();

    }
}