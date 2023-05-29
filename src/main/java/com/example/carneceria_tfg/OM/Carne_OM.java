package com.example.carneceria_tfg.OM;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Model.Proveedor;
import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carne_OM {
    Faker faker = new Faker();

    public List<Carne> getCarnes(List<Proveedor> proveedores) {
        List<Carne> listaCarnses = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String[] names = {"Ternera", "Pollo", "Cerdo", "Cordero","Pavo"};
            listaCarnses.add(new Carne(names[i], proveedores.get(i), faker.number().numberBetween(1, 20), LocalDate.now()));

        }
        return listaCarnses;
    }
}
