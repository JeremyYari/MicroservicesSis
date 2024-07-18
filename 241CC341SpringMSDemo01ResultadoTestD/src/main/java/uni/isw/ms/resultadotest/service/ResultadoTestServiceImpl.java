package uni.isw.ms.resultadotest.service;

import uni.isw.ms.usuario.model.Usuario;
import uni.isw.ms.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoTestServiceImpl implements IResultadoTestService {

    @Autowired
    private ResultadoTestRepository resultadoTestRepository;

    @Override
    public List<ResultadoTest> findAll() {
        return (List<ResultadoTest>) resultadoTestRepository.findAll();
    }

    @Override
    public ResultadoTest findById(Long id) {
        return resultadoTestRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(ResultadoTest resultadoTest) {
        resultadoTestRepository.save(resultadoTest);
    }

    @Override
    public List<ResultadoTest> findByTestId(Long testId) {
        return resultadoTestRepository.findAllByTestId(testId);
    }
}
