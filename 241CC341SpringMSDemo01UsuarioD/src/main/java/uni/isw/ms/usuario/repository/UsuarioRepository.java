package uni.isw.ms.usuario.repository;

import uni.isw.ms.usuario.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findAllByTipoUsuarioId(Long tipoUsuarioId);
}
