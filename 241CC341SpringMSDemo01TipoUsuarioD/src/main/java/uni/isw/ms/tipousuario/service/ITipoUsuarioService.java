package uni.isw.ms.tipousuario.service;

import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    List<TipoUsuario> findAll();
    TipoUsuario findById(Long id);
    void save(TipoUsuario tipoUsuario);
    UsuarioByTipoResponse findUsuariosByTipoUsuarioId(Long tipoUsuarioId);
}
