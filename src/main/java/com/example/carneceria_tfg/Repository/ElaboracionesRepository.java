package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Elaboracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ElaboracionesRepository extends JpaRepository<Elaboracion, Integer> {
    @Transactional
    @Modifying
    @Query("delete from Elaboracion e where e.elaboracion_id = ?1")
    int deleteByElaboracion_id(int elaboracion_id);

    Elaboracion findByNombreEquals(String nombre);

    Elaboracion findBySemanaElaboracion(String semanaElaboracion);

    List<Elaboracion> findAllBySemanaElaboracion(String semana);

    @Query("select e from Elaboracion e where e.elaboracion_id = ?1")
    Elaboracion findByElaboracion_id(Integer id);

}
