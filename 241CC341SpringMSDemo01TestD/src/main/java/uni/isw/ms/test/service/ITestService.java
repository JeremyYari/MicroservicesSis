package uni.isw.ms.test.service;

import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;

import java.util.List;

public interface ITestService {
    List<Test> findAll();
    Test findById(Long id);
    void save(Test test);
    ResultadoTestByTestResponse findResultadosTestByTestId(Long testId);
}
