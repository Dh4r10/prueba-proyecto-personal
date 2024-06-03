package com.walter.alquileres.prueba.walter_alquileres_prueba.Services;

import com.walter.alquileres.prueba.walter_alquileres_prueba.Entities.UsuariosActivos;

import java.util.List;
import java.util.Optional;

public interface IUsuariosActivosService {

    // BUSCAR TODOS
    List<UsuariosActivos> findAllUsuariosActivos();

    // BUSCAR POR ID
    Optional<UsuariosActivos> findUsuariosActivosById(Long id);

}
