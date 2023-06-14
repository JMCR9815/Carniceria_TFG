package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
    @Transactional
    @Modifying
    @Query("update Productos p set p.cantidad = p.cantidad+?1 where p.producto_id = ?2")
    void updateProduct(int cantidad, int producto_id);

    @Transactional
    @Modifying
    @Query("update Productos p set p.cantidad = p.cantidad-?1 where p.producto_id = ?2")
    void shellProduct(int cantidad, int producto_id);

    @Transactional
    @Modifying
    @Query("update Productos p set p.carne=?1")
    void setCarne(Carne byNombreEquals);
    @Transactional
    @Modifying
    @Query("UPDATE Productos e SET e.elaboraciones=NULL where e.elaboraciones.elaboracion_id=?1")
    void setElaboracionNull(Integer id);
}
