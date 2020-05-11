package com.sarracent.springboot.error.app.services;

import com.sarracent.springboot.error.app.controllers.models.domain.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> listar();
    public Usuario obtenerPorId(Integer id);
}
