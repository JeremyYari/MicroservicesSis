package uni.isw.ms.test.http.response;

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
public class ResultadoTestByTestResponse {

    private String testNombre;
    private List<ResultadoTestDTO> resultadoTestDTOList;
}
