package com.example.carneceria_tfg.OM;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Model.Productos;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Productos_OM {
    Faker faker = new Faker();

    public List<Productos> getProductsList(List<Elaboracion> elaboracions) {
        List<Productos> products = new ArrayList<Productos>();
        for (int i = 0; i < 5; i++) {
            Productos product = new Productos(faker.commerce().productName(), faker.commerce().brand(), faker.number().numberBetween(0, 10), faker.number().numberBetween(1, 12), true);
            product.setElaboraciones(elaboracions.get(i));
            products.add(product);

        }
        return products;
    }
}
