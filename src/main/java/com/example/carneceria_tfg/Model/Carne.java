package com.example.carneceria_tfg.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Carne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carne_id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;
    private int catidad;
    private LocalDate fecha_entrada;

    public Carne(String nombre, Proveedor proveedor, int catidad, LocalDate fecha_entrada) {

        this.nombre = nombre;
        this.catidad = catidad;
        this.fecha_entrada = fecha_entrada;
        this.proveedor = proveedor;
    }


    public Carne() {

    }
}
