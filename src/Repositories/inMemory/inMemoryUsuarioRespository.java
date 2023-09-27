package Repositories.inMemory;

import Entities.Usuario;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class inMemoryUsuarioRespository {
    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    
    @Override
    public Usuario create(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }
    @Override
    public Usuario buscarPorEmail(String emai) {
        
        for(Usuario usuario : this.usuarios){
            if(usuario.getEmail().equals(emai)){
                return emai;
            }
        }
        
    }
}
