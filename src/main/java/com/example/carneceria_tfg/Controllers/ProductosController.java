package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Productos;
import com.example.carneceria_tfg.Repository.ProductoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    private final ProductoRepository productoRepository;

    public ProductosController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping
    public Optional<List<Productos>> getAllProductos() {
        return Optional.of(productoRepository.findAll());
    }
}
