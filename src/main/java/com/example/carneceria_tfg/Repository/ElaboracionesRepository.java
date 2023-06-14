package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Elaboracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ElaboracionesRepository extends JpaRepository<Elaboracion, Integer> {
    boolean existsByCodigo(String codigo);


    @Transactional
    @Modifying
    @Query("delete from Elaboracion e where e.elaboracion_id = ?1")
    void deleteByElaboracion_id(int elaboracion_id);

    Elaboracion findByNombreEquals(String nombre);

    Elaboracion findBySemanaElaboracion(String semanaElaboracion);

    List<Elaboracion> findAllBySemanaElaboracion(String semana);

    @Query("select e from Elaboracion e where e.elaboracion_id = ?1")
    Elaboracion findByElaboracion_id(Integer id);

    @Modifying
    @Query("UPDATE Elaboracion e SET e.cantidadElaborada = :#{#elaboracion.cantidadElaborada}, e.carne = :#{#elaboracion.carne},e.semanaElaboracion=:#{#elaboracion.semanaElaboracion} WHERE e.codigo = :#{#elaboracion.codigo}")
    void updateElaboracion(@Param("elaboracion") Elaboracion elaboracion);
}
