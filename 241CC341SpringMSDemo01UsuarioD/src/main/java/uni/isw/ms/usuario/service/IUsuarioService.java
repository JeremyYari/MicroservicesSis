package uni.isw.ms.usuario.service;

import uni.isw.ms.usuario.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> findAll();
    Usuario findById(Long id);
    void save(Usuario usuario);
    List<Usuario> findByTipoUsuarioId(Long tipoUsuarioId);
}
