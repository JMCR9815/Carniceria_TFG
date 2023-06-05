package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    @Transactional
    @Modifying

    @Query("delete from Proveedor p where p.proveedor_id = ?1")
    void deleteByProveedor_id(int proveedor_id);

    @Transactional
    @Modifying
    @Query("update Carne c set c.proveedor=null where c.proveedor.proveedor_id=?1")
    void deleteProveedorCarne(int provvedorID);

    @Transactional
    @Modifying
    @Query("update Proveedor p set p.name = ?1, p.numero_telefono = ?2 where p.proveedor_id = ?3")
    void updateNameAndNumero_telefonoByProveedor_id(String name, String numero_telefono, int proveedor_id);

}
