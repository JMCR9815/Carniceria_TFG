package com.example.carneceria_tfg.DTO;

import com.example.carneceria_tfg.Model.Carne;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Carne}
 */
@Value
public class CarneDto implements Serializable {
    int carne_id;
    String nombre;
    ProveedorDto proveedor;
    int catidad;
    LocalDate fecha_entrada;
}