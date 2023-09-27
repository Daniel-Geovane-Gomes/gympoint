package Repositories;

import Entities.Usuario;

public interface UsuarioRepository {
    public Usuario create(Usuario usuario);
    public Usuario buscarPorEmail(String email);
}
