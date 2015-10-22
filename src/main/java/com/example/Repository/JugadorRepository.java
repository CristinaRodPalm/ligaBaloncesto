package com.example.Repository;
import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 6/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {

    //a
    public List<Jugador> findByNombreStartingWith(String nombre);
    //b
    public List<Jugador> findByCanastasTotalesGreaterThanEqual(int canastasTotales);
    //c
    public List<Jugador> findByAsistenciasTotalesBetween(int minAsistencias, int maxAsistencias);
    //d
    public List<Jugador> findByPosicionCampoLike(String posicionCampo);
    //e
    public List<Jugador> findByFechaNacimientoBefore(Date fecha);
    //f
    public List<Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(int canastas, Date fecha);
}

