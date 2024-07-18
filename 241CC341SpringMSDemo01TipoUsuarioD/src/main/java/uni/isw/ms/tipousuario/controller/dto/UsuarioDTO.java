package uni.isw.ms.tipousuario.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private String nombres;
    private String apellidos;
    private String correo;
    private String coordenadas;
    private Long tipoUsuarioId;
    private String fechaDeNacimiento;
}
