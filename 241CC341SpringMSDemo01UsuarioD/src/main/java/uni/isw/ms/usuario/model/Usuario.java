package uni.isw.ms.usuario.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private String correo;
    private String coordenadas;

    @Column(name = "tipo_usuario_id")
    private Long tipoUsuarioId;

    @Column(name = "fecha_de_nacimiento")
    private String fechaDeNacimiento;
}
