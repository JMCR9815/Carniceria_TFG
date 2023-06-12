package com.example.carneceria_tfg.DTO;

import com.example.carneceria_tfg.Model.Elaboracion;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Elaboracion}
 */
@Value
public class ElaboracionDto implements Serializable {
    String codigo;
    String nombre;
    String semanaElaboracion;
    int cantidadElaborada;
    CarneDto carne;
    String ingredientes;
}