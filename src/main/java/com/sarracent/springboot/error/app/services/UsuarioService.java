package com.sarracent.springboot.error.app.services;

import com.sarracent.springboot.error.app.controllers.models.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> listar();
    public Usuario obtenerPorId(Integer id);
    public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
