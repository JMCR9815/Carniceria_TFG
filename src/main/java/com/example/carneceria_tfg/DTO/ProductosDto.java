package com.example.carneceria_tfg.DTO;

import com.example.carneceria_tfg.Model.Productos;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Productos}
 */
@Value
public class ProductosDto implements Serializable {
    String nombre;
    String descripcion;
    int precio;
    int cantidad;
    boolean disponibilidad;
    ElaboracionDto elaboraciones;
    CarneDtoNoProveedor carne;
}