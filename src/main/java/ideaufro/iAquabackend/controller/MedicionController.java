package ideaufro.iAquabackend.controller;

import ideaufro.iAquabackend.domain.Medicion;
import ideaufro.iAquabackend.service.MedicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicionController {

    @Autowired
    private MedicionService medicionService;

    @PostMapping ("/agregarMedicion")
    public Medicion agregarMedicion(@RequestBody Medicion med1){
        return medicionService.crearMedicion(med1);
    }

    @GetMapping("/obtenerMediciones")
   public List<Medicion> obtenerMediciones(){
        return medicionService.obtenerMediciones();
    }
}
