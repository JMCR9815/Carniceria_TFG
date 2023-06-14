package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import com.example.carneceria_tfg.Repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElaboracionService {
    private final ElaboracionesRepository elaboracionRepository;
    private final ProductoRepository productoRepository;

    public ElaboracionService(ElaboracionesRepository elaboracionRepository,
                              ProductoRepository productoRepository) {
        this.elaboracionRepository = elaboracionRepository;
        this.productoRepository = productoRepository;
    }

    @SuppressWarnings("NewApi")
    public Optional<List<Elaboracion>> findElaboracionesBySemana(String semana) {
        return Optional.of(elaboracionRepository.findAllBySemanaElaboracion(semana));
    }

    public Elaboracion addElaboracion(Elaboracion elaboracion) {
        if (elaboracionRepository.existsByCodigo(elaboracion.getCodigo())) {
            elaboracionRepository.updateElaboracion(elaboracion);
        }
        return elaboracionRepository.save(elaboracion);
    }

    @SuppressWarnings("NewApi")
    public Optional<List<Elaboracion>> findall() {
        return Optional.of(elaboracionRepository.findAll());
    }

    @SuppressWarnings("NewApi")
    public Optional<Elaboracion> getElaboracion(Integer id) {
        return Optional.of(elaboracionRepository.findByElaboracion_id(id));
    }


    public void removeElaboracion(Integer id) {
        productoRepository.setElaboracionNull(id);
        elaboracionRepository.deleteByElaboracion_id(id);
    }

}
