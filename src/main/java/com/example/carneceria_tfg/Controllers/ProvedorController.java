package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Proveedor;
import com.example.carneceria_tfg.Repository.ProveedorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proveedores")
public class ProvedorController {
    private final ProveedorRepository provedorRepository;



    public ProvedorController(ProveedorRepository proveedorRepository) {
        this.provedorRepository = proveedorRepository;
    }

    @GetMapping
    public Optional<List<Proveedor>> getAllProveedores() {
        return Optional.of(provedorRepository.findAll());
    }

}
