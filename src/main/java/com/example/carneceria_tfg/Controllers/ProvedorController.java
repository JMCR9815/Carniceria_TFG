package com.example.carneceria_tfg.Controllers;

import com.example.carneceria_tfg.Model.Proveedor;
import com.example.carneceria_tfg.Repository.CarneRepository;
import com.example.carneceria_tfg.Service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proveedores")
public class ProvedorController {
    private final ProveedorService provedorService;
    private final CarneRepository carneRepository;


    public ProvedorController(ProveedorService provedorService, CarneRepository carneRepository) {
        this.provedorService = provedorService;

        this.carneRepository = carneRepository;
    }


    @SuppressWarnings("NewApi")
    @GetMapping
    public Optional<List<Proveedor>> getAllProveedores() {
        return provedorService.findAll();
    }

    @GetMapping("/getProveedor/{proveedor_id}")
    public Optional<Proveedor> getProveedorById(@PathVariable Integer proveedor_id) {
        return provedorService.findById(proveedor_id);
    }

    @PutMapping("/updateProveedor/{id}")
    public void updateProveedor(@PathVariable int id, @RequestBody Proveedor proveedor) {
        provedorService.updateProveedor(id, proveedor);
    }

    @DeleteMapping("/deleteProveedor/{id_proveedor}")
    public void deleteProveedor(@PathVariable int id_proveedor) {
        provedorService.deleteProveedor(id_proveedor);
    }

    @SuppressWarnings("NewApi")
    @PostMapping("/addProveedor")
    public Optional<Proveedor> addProveedor(@RequestBody Proveedor proveedor) {
        return Optional.of(provedorService.addProveedor(proveedor));
    }
}
