package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Productos;
import com.example.carneceria_tfg.Service.ProductosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    private final ProductosService productosService;

    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }


    @GetMapping
    public Optional<List<Productos>> getAllProductos() {
        return Optional.of(productosService.getAllProducts());
    }

    @GetMapping("/{id}")
    public Optional<Productos> getProductoById(@PathVariable Integer id) {
        return productosService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public Optional<Productos> addProducto(@RequestBody Productos producto) {
        return productosService.addProduct(producto);
    }

    @PostMapping("/addProductWithElaboracion/{nombre_elaboracion}")
    public Optional<Productos> addProductoWithElaboracion(@RequestBody Productos productos, @PathVariable String nombre_elaboracion) {
        return productosService.addProductWithElaboracion(productos, nombre_elaboracion);
    }

    @PostMapping("/addProductWithCarne/{nombre_carne}")
    public Optional<Productos> addProductoWithCarne(@RequestBody Productos productos, @PathVariable String nombre_carne) {
        return productosService.addProductWithCarne(productos, nombre_carne);
    }




}
