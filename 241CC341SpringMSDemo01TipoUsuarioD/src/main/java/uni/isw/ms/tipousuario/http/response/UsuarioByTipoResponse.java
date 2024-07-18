package uni.isw.ms.tipousuario.http.response;

import uni.isw.ms.tipousuario.controller.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioByTipoResponse {

    private String tipoUsuarioNombre;
    private List<UsuarioDTO> usuarioDTOList;
}
