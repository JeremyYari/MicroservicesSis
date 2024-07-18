package uni.isw.ms.tipousuario.service;

import uni.isw.ms.tipousuario.client.UsuarioClient;
import uni.isw.ms.tipousuario.controller.dto.UsuarioDTO;
import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;
import uni.isw.ms.tipousuario.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioServiceImpl implements ITipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    @Override
    public List<TipoUsuario> findAll() {
        return (List<TipoUsuario>) tipoUsuarioRepository.findAll();
    }

    @Override
    public TipoUsuario findById(Long id) {
        return tipoUsuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("TipoUsuario not found"));
    }

    @Override
    public void save(TipoUsuario tipoUsuario) {
        tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public UsuarioByTipoResponse findUsuariosByTipoUsuarioId(Long tipoUsuarioId) {
        // Consultar si existe el tipo de usuario
        TipoUsuario tipoUsuario = tipoUsuarioRepository.findById(tipoUsuarioId)
                .orElseThrow(() -> new RuntimeException("TipoUsuario not found"));

        // Obtener los usuarios
        List<UsuarioDTO> usuarioDTOList = usuarioClient.findAllUsuariosByTipoUsuario(tipoUsuarioId);

        return UsuarioByTipoResponse.builder()
                .tipoUsuarioNombre(tipoUsuario.getNombre())
                .usuarioDTOList(usuarioDTOList)
                .build();
    }
}
