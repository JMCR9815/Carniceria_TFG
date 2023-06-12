package com.example.carneceria_tfg.DTO;

import com.example.carneceria_tfg.Model.Proveedor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Proveedor}
 */
@Value
public class ProveedorDto implements Serializable {
    String name;
    String numero_telefono;
}