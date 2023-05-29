package com.example.carneceria_tfg.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proveedor_id;
    private String name;
    private String numero_telefono;


    public Proveedor(String name, String numero_telefono) {
        this.name = name;
        this.numero_telefono = numero_telefono;
    }

    public Proveedor() {

    }
}
