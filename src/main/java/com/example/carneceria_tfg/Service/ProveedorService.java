package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Proveedor;
import com.example.carneceria_tfg.Repository.ProductoRepository;
import com.example.carneceria_tfg.Repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {
    private final ProveedorRepository proveedorRepository;
    private final ProductoRepository productoRepository;

    public ProveedorService(ProveedorRepository proveedorRepository, ProductoRepository productoRepository) {
        this.proveedorRepository = proveedorRepository;
        this.productoRepository = productoRepository;
    }


    @SuppressWarnings("NewApi")
    public Optional<List<Proveedor>> findAll() {
        return Optional.of(proveedorRepository.findAll());
    }


    public Optional<Proveedor> findById(int id) {
        return proveedorRepository.findById(id);
    }

    public void updateProveedor(int idProvedor, Proveedor proveedor) {
        proveedorRepository.updateNameAndNumero_telefonoByProveedor_id(proveedor.getName(), proveedor.getNumero_telefono(), idProvedor);
    }

    public void deleteProveedor(int idProvedor) {
        proveedorRepository.deleteProveedorCarne(idProvedor);
        proveedorRepository.deleteByProveedor_id(idProvedor);
    }

    public Proveedor addProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
