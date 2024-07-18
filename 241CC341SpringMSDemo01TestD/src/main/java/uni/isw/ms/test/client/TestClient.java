package uni.isw.ms.test.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import uni.isw.ms.tipousuario.controller.dto.UsuarioDTO;

import java.util.List;

@FeignClient(name = "resultadotest-service", url = "http://localhost:9095")
public interface ResultadoTestClient {

    @GetMapping("/api/resultadotest/search-by-test/{testId}")
    List<ResultadoTestDTO> findAllResultadosTestByTest(@PathVariable("testId") Long testId);
}
