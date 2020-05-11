package com.sarracent.springboot.error.app.services;

import com.sarracent.springboot.error.app.controllers.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1, "Damian", "Sarracent"));
        this.lista.add(new Usuario(2, "Anabel", "Sarracent"));
        this.lista.add(new Usuario(3, "Oralis", "Lopez"));
        this.lista.add(new Usuario(4, "Fidel", "Sarracent"));
        this.lista.add(new Usuario(5, "Dunia", "Acosta"));
        this.lista.add(new Usuario(6, "Nina", "Sauser"));
        this.lista.add(new Usuario(7, "Willy", "Bolita"));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        Usuario resultado = null;
        for (Usuario u: this.lista) {
            if (u.getId().equals(id)) {
                resultado = u;
                break;
            }
        }
        return resultado;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        Usuario usuario = obtenerPorId(id);
        return Optional.ofNullable(usuario);
    }
}
