package foro.alura.api.Usuario;

import foro.alura.api.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

}
