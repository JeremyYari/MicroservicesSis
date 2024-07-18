package uni.isw.ms.usuario.controller;

import uni.isw.ms.usuario.model.Usuario;
import uni.isw.ms.usuario.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUsuario(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @GetMapping("/search-by-tipo/{tipoUsuarioId}")
    public ResponseEntity<?> findByTipoUsuarioId(@PathVariable Long tipoUsuarioId){
        return ResponseEntity.ok(usuarioService.findByTipoUsuarioId(tipoUsuarioId));
    }
}
