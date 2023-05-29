package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Repository.CarneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carne")
public class CarneController {
    private final CarneRepository carneRepository;

    public CarneController(CarneRepository carneRepository) {
        this.carneRepository = carneRepository;
    }

    @GetMapping
    public Optional<List<Carne>> getCarneList() {
        return Optional.of(carneRepository.findAll());
    }
}
