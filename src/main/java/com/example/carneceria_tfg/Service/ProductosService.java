package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Productos;
import com.example.carneceria_tfg.Repository.CarneRepository;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import com.example.carneceria_tfg.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ElaboracionesRepository elaboracionesRepository;
    @Autowired
    private CarneRepository carneRepository;

    public List<Productos> getAllProducts() {
        return productoRepository.findAll();
    }

    public Optional<Productos> getProductById(Integer id_product) {
        return productoRepository.findById(id_product);
    }

    public Optional<Productos> addProduct(Productos producto) {
        if (!productoRepository.existsById(producto.getProducto_id())) {
            productoRepository.save(producto);
            return Optional.of(producto);
        } else {
            productoRepository.updateProduct(producto.getCantidad(), producto.getProducto_id());
        }
        return Optional.empty();
    }

    public Optional<Productos> addProductWithElaboracion(Productos producto, String nombre) {
        if (!productoRepository.existsById(producto.getProducto_id())) {
            producto.setElaboraciones(elaboracionesRepository.findByNombreEquals(nombre));
            productoRepository.save(producto);
            return Optional.of(producto);
        } else {
            producto.setElaboraciones(elaboracionesRepository.findByNombreEquals(nombre));
            productoRepository.updateProduct(producto.getCantidad(), producto.getProducto_id());

        }
        return Optional.empty();
    }

    public Optional<Productos> addProductWithCarne(Productos producto, String carne) {
        if (!productoRepository.existsById(producto.getProducto_id())) {
            producto.setCarne(carneRepository.findByNombreEquals(carne));
            productoRepository.save(producto);
            return Optional.of(producto);
        } else {
            producto.setCarne(carneRepository.findByNombreEquals(carne));
            productoRepository.updateProduct(producto.getCantidad(), producto.getProducto_id());

        }
        return Optional.empty();
    }

    public Optional<Productos>shellProduct(Integer id, int cantidad){
        if(productoRepository.existsById(id)){
            productoRepository.shellProduct(cantidad, id);
            return Optional.of(productoRepository.findById(id).get());
        }
        return Optional.empty();
    }



}
