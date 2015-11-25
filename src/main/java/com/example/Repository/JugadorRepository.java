package com.example.Repository;
import com.example.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 6/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {

    //PRACTICA 1
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


    //PRACTICA 2
    //Se utiliza _ para definir explícitamente que se trata de una propiedad del objeto al que le precede.
    //Solo es necesario cuando existen variables de varias palabras que puedan crear ambiguedad en la selección.
    List<Jugador> findByEquipo_Nombre(String equipoNombre);

    List<Jugador> findByEquipoNombreAndPosicionCampoLike(String equipoNombre, String posicion);

    Jugador findFirstByOrderByCanastasTotalesDesc();

    List<Jugador> findFirst5ByOrderByAsistenciasTotalesDesc();


    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :equipoNombre ORDER BY j.canastasTotales DESC")
    List<Jugador> findByEquipoNombreCanastasTotalesDesc(@Param("equipoNombre") String equipoNombre);

    //Con @Query podemos definir una consulta personalizada con nombre personalizado
    //En este caso no nos hace falta el @Query obligatoriamente. Podríamos usar findByEquipoNombreOrderByCanastasDesc
}

