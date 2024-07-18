package uni.isw.ms.tipousuario.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import uni.isw.ms.tipousuario.controller.dto.UsuarioDTO;

import java.util.List;

@FeignClient(name = "usuario-service", url = "http://localhost:9095")
public interface UsuarioClient {

    @GetMapping("/api/usuario/search-by-tipo/{tipoUsuarioId}")
    List<UsuarioDTO> findAllUsuariosByTipoUsuario(@PathVariable("tipoUsuarioId") Long tipoUsuarioId);
}
