package uni.isw.ms.tipousuario.controller;

import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;
import uni.isw.ms.tipousuario.service.ITipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipo-usuario")
public class TipoUsuarioController {

    @Autowired
    private ITipoUsuarioService tipoUsuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
        tipoUsuarioService.save(tipoUsuario);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(tipoUsuarioService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(tipoUsuarioService.findById(id));
    }

    @GetMapping("/search-usuarios/{tipoUsuarioId}")
    public ResponseEntity<?> findUsuariosByTipoUsuarioId(@PathVariable Long tipoUsuarioId){
        UsuarioByTipoResponse response = tipoUsuarioService.findUsuariosByTipoUsuarioId(tipoUsuarioId);
        return ResponseEntity.ok(response);
    }
}
