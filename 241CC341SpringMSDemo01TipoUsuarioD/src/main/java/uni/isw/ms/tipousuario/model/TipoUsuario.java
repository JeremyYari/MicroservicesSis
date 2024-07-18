package uni.isw.ms.tipousuario.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tipos_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
