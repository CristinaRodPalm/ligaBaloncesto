package com.example.Exceptions;

import com.example.Model.Jugador;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jhipster on 11/11/15.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException{
    public EquipoException (Long id){
        super("No existe un equipo con el id "+id);
    }
}

