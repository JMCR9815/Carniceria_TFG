package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Service.ElaboracionService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/semana/{semanaElaboracion}")
    public Optional<List<Elaboracion>> getElaboracionesBySemana(@PathVariable String semanaElaboracion) {
        return elaboracionService.findElaboracionesBySemana(semanaElaboracion);
    }

    @GetMapping("/id/{id}")
    public Optional<Elaboracion> getElaboracion(@PathVariable Integer id) {
        return elaboracionService.getElaboracion(id);
    }

    @PostMapping("/addElaboracion")
    public Elaboracion addElaboracion(@RequestBody Elaboracion elaboracion) {
        return elaboracionService.addElaboracion(elaboracion);
    }

    @DeleteMapping("/deleteElaboracion/{elaboracion_id}")
    public void deleteElaboracion(@PathVariable Integer elaboracion_id) {
        elaboracionService.removeElaboracion(elaboracion_id);
    }

}
