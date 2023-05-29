package com.example.carneceria_tfg.OM;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Model.Elaboracion;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Elaboracion_OM {
    Faker faker = new Faker();

    public List<Elaboracion> generateElaboraciones(List<Carne> carnes) {
        List<Elaboracion> elaboraciones = new ArrayList<Elaboracion>();
        for (int i = 0; i < 5; i++) {
            String[] nombreElaboraciones = {"Hamburguesas", "Salchichas", "Chroizo", "Jamon (Al corte)","Corte carne"};
            elaboraciones.add(new Elaboracion(nombreElaboraciones[i], faker.number().numberBetween(1, 12), carnes.get(i), faker.lorem().sentence(5)));
        }
        return elaboraciones;
    }
}
