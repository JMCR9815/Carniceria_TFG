package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Repository.CarneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CarneService {
    public final CarneRepository carneRepository;

    public CarneService(CarneRepository carneRepository) {
        this.carneRepository = carneRepository;
    }

    public Optional<List<Carne>> findAll() {
        return Optional.of(carneRepository.findAll());
    }

    public Carne getCarneByName(String canreName) {
        return carneRepository.findByNombre(canreName);
    }

    public Carne addCarne(Carne carne) {
        if (carneRepository.existsByNombreLikeAllIgnoreCase(carne.getNombre())) {
            carneRepository.updateCatidadAndFecha_entradaByCatidadAndFecha_entrada(carne.getCatidad(), carne.getFecha_entrada(), carne.getNombre());
        } else {
            return carneRepository.save(carne);
        }
        return carne;
    }

    public void delete(Carne carneByName) {
        carneByName.setCatidad(0);
        carneRepository.updateCatidadByCatidad(carneByName.getCatidad(), carneByName.getCarne_id());
    }
}
