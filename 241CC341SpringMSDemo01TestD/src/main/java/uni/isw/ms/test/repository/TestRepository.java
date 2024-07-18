package uni.isw.ms.test.repository;

import uni.isw.ms.tipousuario.model.TipoUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {
}
