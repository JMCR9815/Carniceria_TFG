package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Productos,Integer> {
}
