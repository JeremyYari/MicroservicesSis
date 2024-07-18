package uni.isw.ms.resultadotest.service;

import uni.isw.ms.usuario.model.Usuario;

import java.util.List;

public interface IResultadoTestService {

    List<ResultadoTest> findAll();
    ResultadoTest findById(Long id);
    void save(ResultadoTest resultadotest);
    List<ResultadoTest> findByTestId(Long TestId);
}
