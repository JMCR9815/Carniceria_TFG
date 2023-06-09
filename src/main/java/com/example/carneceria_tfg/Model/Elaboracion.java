package com.example.carneceria_tfg.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

@Entity
@Getter
@Setter
public class Elaboracion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int elaboracion_id;

    private String codigo;
    private String nombre;
    private String semanaElaboracion;
    private int cantidadElaborada;

    @ManyToOne( )
    @JoinColumn(name = "carne_id")
    private Carne carne;


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

        // Generar el código de producto utilizando el número de semanas de elaboración y el nombre del producto
        this.codigo = this.semanaElaboracion + "-" + this.nombre;
    }

    // Constructor vacío
    public Elaboracion() {
    }
}
