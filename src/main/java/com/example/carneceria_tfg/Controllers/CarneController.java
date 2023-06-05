package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Repository.CarneRepository;
import com.example.carneceria_tfg.Service.CarneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carne")
public class CarneController {
    private final CarneService carneService;
    private final CarneRepository carneRepository;

    public CarneController(CarneService carneService, CarneRepository carneRepository) {
        this.carneService = carneService;

        this.carneRepository = carneRepository;
    }

    @GetMapping
    public Optional<List<Carne>> getCarneList() {
        return carneService.findAll();
    }

    @GetMapping("/getCarneByName/{canre_name}")
    public Optional<Carne> getCarneByName(@PathVariable String canre_name) {
        return Optional.of(carneService.getCarneByName(canre_name));
    }

    @PostMapping("/addCarne")
    public Optional<Carne> addCarne(@RequestBody Carne carne) {
        return Optional.of(carneService.addCarne(carne));
    }

    @PutMapping("/deleteCarne/{carne_name}")
    public void deleteCarne(@PathVariable String carne_name) {
        carneService.delete(carneService.getCarneByName(carne_name));
    }
}
