package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer> {

}