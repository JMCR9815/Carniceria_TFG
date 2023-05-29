package com.example.carneceria_tfg.OM;

import com.example.carneceria_tfg.Model.Proveedor;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Proveedor_OM {
    Faker faker = new Faker();

    public List<Proveedor> listaProveedores() {
        List<Proveedor> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(new Proveedor(faker.company().name(), faker.phoneNumber().phoneNumber()));
        }
        return result;
    }
}
