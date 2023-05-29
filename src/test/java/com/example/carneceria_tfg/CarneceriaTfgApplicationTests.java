package com.example.carneceria_tfg;

import com.example.carneceria_tfg.Model.Carne;
import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Model.Productos;
import com.example.carneceria_tfg.Model.Proveedor;
import com.example.carneceria_tfg.OM.Carne_OM;
import com.example.carneceria_tfg.OM.Elaboracion_OM;
import com.example.carneceria_tfg.OM.Productos_OM;
import com.example.carneceria_tfg.OM.Proveedor_OM;
import com.example.carneceria_tfg.Repository.CarneRepository;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import com.example.carneceria_tfg.Repository.ProductoRepository;
import com.example.carneceria_tfg.Repository.ProveedorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CarneceriaTfgApplicationTests {
    @Autowired
    private CarneRepository carneRepository;
    @Autowired
    private ElaboracionesRepository elaboracionesRepository;
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ProveedorRepository proveedorRepository;


    @Test
    void contextLoads() {
        /*Carne_OM carne_OM = new Carne_OM();
        Proveedor_OM proveedor_OM = new Proveedor_OM();
        Elaboracion_OM elaboracion_OM = new Elaboracion_OM();
        Productos_OM productos_OM = new Productos_OM();
        List<Proveedor> proveedores = proveedor_OM.listaProveedores();
        List<Carne> listaCarne = carne_OM.getCarnes(proveedores);
        List<Elaboracion> listaElaboraciones = elaboracion_OM.generateElaboraciones(listaCarne);
        List<Productos> listaProductos = productos_OM.getProductsList(listaElaboraciones);
        proveedorRepository.saveAll(proveedores);
        carneRepository.saveAll(listaCarne);
        elaboracionesRepository.saveAll(listaElaboraciones);
        productoRepository.saveAll(listaProductos);*/
    }

}
