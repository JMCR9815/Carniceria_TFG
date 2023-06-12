package com.example.carneceria_tfg.DTO;

import com.example.carneceria_tfg.Model.Carne;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Carne}
 */
@Value
public class CarneDtoNoProveedor implements Serializable {
    String nombre;
    int catidad;
    LocalDate fecha_entrada;
}