package com.walter.alquileres.prueba.walter_alquileres_prueba.Services.jpa;

import com.walter.alquileres.prueba.walter_alquileres_prueba.Entities.UsuariosActivos;
import com.walter.alquileres.prueba.walter_alquileres_prueba.Repositories.UsuariosActivosRepository;
import com.walter.alquileres.prueba.walter_alquileres_prueba.Services.IUsuariosActivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosActivosService implements IUsuariosActivosService {

    @Autowired
    private UsuariosActivosRepository usuariosActivosRepository;

    public List<UsuariosActivos> findAllUsuariosActivos() {
        return usuariosActivosRepository.findAll();
    }

    public Optional<UsuariosActivos> findUsuariosActivosById(Long id) {
        return usuariosActivosRepository.findById(id);
    }

}
