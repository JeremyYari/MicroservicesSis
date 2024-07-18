package uni.isw.ms.resultadotest.controller;

import uni.isw.ms.usuario.model.Usuario;
import uni.isw.ms.usuario.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resultadotest")
public class ResultadoTestController {

    @Autowired
    private IResultadoTestService resultadoTestService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveResultadoTest(@RequestBody ResultadoTest resultadotest){
        resultadoTestService.save(resultadotest);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(resultadoTestService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(resultadoTestService.findById(id));
    }

    @GetMapping("/search-by-test/{testId}")
    public ResponseEntity<?> findByTestId(@PathVariable Long testId){
        return ResponseEntity.ok(testService.findByTestId(testId));
    }
}
