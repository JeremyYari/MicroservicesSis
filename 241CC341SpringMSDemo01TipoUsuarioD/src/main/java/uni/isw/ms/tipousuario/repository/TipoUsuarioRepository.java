package uni.isw.ms.tipousuario.repository;

import uni.isw.ms.tipousuario.model.TipoUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends CrudRepository<TipoUsuario, Long> {
}
