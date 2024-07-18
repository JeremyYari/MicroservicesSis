package uni.isw.ms.test.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoTestDTO {
    private Long puntaje;
    private String resultado;
    private String comentario;
    private Long testId;
    private Long usuarioId;
}
