package com.example.carneceria_tfg.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;

@Entity
public class Elaboracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int elaboracion_id;

    private String codigo;
    private String nombre;
    private String semanaElaboracion;
    private int cantidadElaborada;

    @ManyToOne
    @JoinColumn(name = "carne_id")
    private Carne carne;

    @OneToMany(mappedBy = "elaboraciones")
    private List<Productos> productos;

    private String ingredientes;


    // Constructor con parámetros
    public Elaboracion(String nombre, int cantidadElaborada, Carne carne, String ingredientes) {
        this.nombre = nombre;
        this.cantidadElaborada = cantidadElaborada;
        this.carne = carne;
        this.ingredientes = ingredientes;

        // Generar el código de elaboración utilizando el número de semana actual
        LocalDate fechaActual = LocalDate.now();
        int numeroSemana = fechaActual.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
        this.semanaElaboracion = "S" + numeroSemana;

        // Generar el código de producto utilizando el número de semana de elaboración y el nombre del producto
        this.codigo = this.semanaElaboracion + "-" + this.nombre;
    }

    // Constructor vacío
    public Elaboracion() {
    }
}