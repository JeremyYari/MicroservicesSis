package uni.isw.ms.resultadotest.repository;

import uni.isw.ms.usuario.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultadoTestRepository extends CrudRepository<ResultadoTest, Long> {

    List<ResultadoTest> findAllByTestId(Long testId);
}
