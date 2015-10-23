package com.example.Repository;
import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 6/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {


    public List<Jugador> findByAsistenciasTotalesGreaterThan(int asistencias);



}

