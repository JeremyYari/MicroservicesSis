package uni.isw.ms.test.controller;

import uni.isw.ms.tipousuario.http.response.UsuarioByTipoResponse;
import uni.isw.ms.tipousuario.model.TipoUsuario;
import uni.isw.ms.tipousuario.service.ITipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTest(@RequestBody Test test){
        testService.save(test);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(testService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(testService.findById(id));
    }

    @GetMapping("/search-resultados-test/{testId}")
    public ResponseEntity<?> findAllResultadosTestByTestId(@PathVariable Long testId){
        ResultadosTestByTestResponse response = testService.findResultadoTestByTestId(testId);
        return ResponseEntity.ok(response);
    }
}
