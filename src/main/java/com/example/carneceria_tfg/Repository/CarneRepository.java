package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Carne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
public interface CarneRepository extends JpaRepository<Carne, Integer> {
    @Transactional
    @Modifying
    @Query("update Carne c set c.catidad = ?1 where c.carne_id=?2 ")
    void updateCatidadByCatidad(int catidad, int id_carne);

    @Transactional
    @Modifying
    @Query("update Carne c set c.catidad = ?1, c.fecha_entrada = ?2 where c.nombre=?3")
    void updateCatidadAndFecha_entradaByCatidadAndFecha_entrada(int catidad, LocalDate fecha_entrada, String carne_name);

    boolean existsByNombreLikeAllIgnoreCase(String nombre);

    Carne findByNombre(String canreName);
}
