package com.walter.alquileres.prueba.walter_alquileres_prueba.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "usuarios_activos")
@Immutable
public class UsuariosActivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dni;
    private String usuario;
    private String tipoUsuario;
    private String correo;
    private String ultimoIngreso;

    public Long getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUltimoIngreso() {
        return ultimoIngreso;
    }

    @Override
    public String toString() {
        return "UsuariosActivos{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", usuario='" + usuario + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", correo='" + correo + '\'' +
                ", ultimoIngreso='" + ultimoIngreso + '\'' +
                '}';
    }
}
