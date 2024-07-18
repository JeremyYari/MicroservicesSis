package uni.isw.ms.usuario.service;

import uni.isw.ms.usuario.model.Usuario;
import uni.isw.ms.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findByTipoUsuarioId(Long tipoUsuarioId) {
        return usuarioRepository.findAllByTipoUsuarioId(tipoUsuarioId);
    }
}
