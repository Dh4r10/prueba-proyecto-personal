package com.walter.alquileres.prueba.walter_alquileres_prueba.Controllers;

import com.walter.alquileres.prueba.walter_alquileres_prueba.Entities.UsuariosActivos;
import com.walter.alquileres.prueba.walter_alquileres_prueba.Services.IUsuariosActivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuarios-activos")
public class UsuariosActivosController {

    @Autowired
    private IUsuariosActivosService iUsuariosActivosService;

    @GetMapping()
    public String ListaUsuariosActivos(Model model) {
        List<UsuariosActivos> usuariosActivos = iUsuariosActivosService.findAllUsuariosActivos();
        model.addAttribute("usuariosActivos", usuariosActivos);
        return "usuarios-activos";
    }

}
