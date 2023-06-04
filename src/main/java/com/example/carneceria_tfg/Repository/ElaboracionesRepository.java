package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Elaboracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElaboracionesRepository extends JpaRepository<Elaboracion, Integer> {
    Elaboracion findByNombreEquals(String nombre);

    Elaboracion findBySemanaElaboracion(String semanaElaboracion);

    List<Elaboracion> findAllBySemanaElaboracion(String semana);
}
