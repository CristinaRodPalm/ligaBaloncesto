package com.example.Service;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 23/10/15.
 */
@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    public void crearLiga(){
        Liga ligaBaloncesto = new Liga("ACB");
        ligaRepository.save(ligaBaloncesto);

        System.out.println(ligaBaloncesto.toString());
    }
}
