package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElaboracionService {
    private final ElaboracionesRepository elaboracionRepository;

    public ElaboracionService(ElaboracionesRepository elaboracionRepository) {
        this.elaboracionRepository = elaboracionRepository;
    }

    public Optional<List<Elaboracion>> findElaboracionesBySemana(String semana) {
        return Optional.of(elaboracionRepository.findAllBySemanaElaboracion(semana));
    }

    public Elaboracion addElaboracion(Elaboracion elaboracion) {
        return elaboracionRepository.save(elaboracion);
    }

    public Optional<List<Elaboracion>> findall() {
        return Optional.of(elaboracionRepository.findAll());
    }


   
}
