package Main;

import Entities.Usuario;
import Enums.Funcao;
import Repositories.Hibernate.HibernateUsuarioRepository;
import Utils.JpaManager;
import io.github.cdimascio.dotenv.Dotenv;
import javax.persistence.EntityManager;

public class Main {

    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        HibernateUsuarioRepository repository = new HibernateUsuarioRepository();
        Usuario u = repository.buscarPorEmail("gustavo@gmail.com");
        System.out.println(u.getNome());

    }
}
