package uni.isw.ms.resultadotest.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "resultadostest")
public class ResultadoTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long puntaje;
    private String resultado;
    private String comentario;

    @Column(name = "test_id")
    private Long testId;

    @Column(name = "usuario_id")
    private Long usuarioId;
}
