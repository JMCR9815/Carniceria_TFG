package com.example.carneceria_tfg.Service;

import com.example.carneceria_tfg.Model.Elaboracion;
import com.example.carneceria_tfg.Repository.ElaboracionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElaboracionService {
    @Autowired
    private ElaboracionesRepository elaboracionRepository;

    private Optional<Elaboracion> findElaboracionByName(String name) {
        return Optional.ofNullable(elaboracionRepository.findByNombreEquals(name));
    }
}
