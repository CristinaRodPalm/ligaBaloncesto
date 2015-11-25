package com.example.Controllers;

import com.example.Exceptions.JugadorException;
import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jhipster on 3/11/15.
 */
@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> jugadores = new ArrayList<Jugador>();

        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugadores.add(iterator.next());
        }

        return jugadores;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);
        if(jugador == null) throw new JugadorException(id);

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateBYId(@PathVariable Long id, @RequestBody Jugador jugador){
        Jugador j1 = jugadorRepository.findOne(id);

        if(j1 == null) throw new JugadorException(id);

        return jugadorRepository.save(jugador);
    }

}
