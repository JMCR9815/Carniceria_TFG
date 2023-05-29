package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elaboraciones")
public class ElaboracionController {
    private final ElaboracionesRepository elaboracionesRepository;

    public ElaboracionController(ElaboracionesRepository elaboracionesRepository) {
        this.elaboracionesRepository = elaboracionesRepository;
    }

    @GetMapping
    public Optional<List<Elaboracion>> getAllElaboraciones() {
        return Optional.of(elaboracionesRepository.findAll());
    }
}
