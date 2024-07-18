package uni.isw.ms.test.service;

import uni.isw.ms.tipousuario.client.UsuarioClient;
import uni.isw.ms.tipousuario.controller.dto.UsuarioDTO;
import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;
import uni.isw.ms.tipousuario.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ResultadoTestClient ResultadoTestClient;

    @Override
    public List<Test> findAll() {
        return (List<Test>) testRepository.findAll();
    }

    @Override
    public Test findById(Long id) {
        return testRepository.findById(id).orElseThrow(() -> new RuntimeException("Test not found"));
    }

    @Override
    public void save(Test test) {
        testRepository.save(test);
    }

    @Override
    public ResultadoTestByTestResponse findResultadosTestByTestId(Long testId) {
        // Consultar si existe el tipo de usuario
        Test test = testRepository.findById(testId)
                .orElseThrow(() -> new RuntimeException("Test not found"));

        // Obtener los usuarios
        List<ResultadoTestDTO> ResultadoTestDTOList = ResultadoTestClient.findAllResultadosTestByTest(testId);

        return ResultadoTestByTestResponse.builder()
                .testNombre(test.getNombre())
                .ResultadoTestDTOList(ResultadoTestDTOList)
                .build();
    }
}
