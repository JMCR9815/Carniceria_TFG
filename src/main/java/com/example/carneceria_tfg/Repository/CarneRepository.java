package com.example.carneceria_tfg.Repository;

import com.example.carneceria_tfg.Model.Carne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarneRepository  extends JpaRepository<Carne,Integer> {

}
