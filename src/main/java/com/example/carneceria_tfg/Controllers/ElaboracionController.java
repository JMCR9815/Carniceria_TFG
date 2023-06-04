package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Service.ElaboracionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elaboraciones")
public class ElaboracionController {
    private final ElaboracionService elaboracionService;

    public ElaboracionController(ElaboracionService elaboracionService) {
        this.elaboracionService = elaboracionService;
    }

    @GetMapping
    public Optional<List<Elaboracion>> getAllElaboraciones() {
        return elaboracionService.findall();
    }

    @GetMapping("/{semanaElaboracion}")
    public Optional<List<Elaboracion>> getElaboracionesBySemana(@PathVariable("semanaElaboracion") String semanaElaboracion) {
        return elaboracionService.findElaboracionesBySemana(semanaElaboracion);
    }


}
