package com.example.carneceria_tfg.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Productos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int producto_id;
    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidad;
    private boolean disponibilidad;


    @ManyToOne
    @JoinColumn(referencedColumnName = "elaboracion_id")
    private Elaboracion elaboraciones;

    @ManyToOne
    @JoinColumn(referencedColumnName = "carne_id")
    private Carne carne;

    public Productos(String nombre, String descripcion, int precio, int cantidad, boolean disponibilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }

    public Productos() {

    }


}
