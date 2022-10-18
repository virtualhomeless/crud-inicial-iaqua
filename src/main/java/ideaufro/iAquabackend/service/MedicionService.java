package ideaufro.iAquabackend.service;

import ideaufro.iAquabackend.domain.Medicion;
import ideaufro.iAquabackend.repository.MedicionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class MedicionService {

    @Autowired
    private MedicionRepository medicionRepository;

    public Medicion crearMedicion (Medicion medicion1){
        medicion1.setEstado("Ok");
        medicion1.setUsuario("Carlos Jimenez");
        medicion1.setPlanta("Pitrufquen 02");
        medicion1.setFechaHora("17:31:23");
        return medicionRepository.save(medicion1);
    }

    public List<Medicion> obtenerMediciones(){
        return medicionRepository.findAll();
    }
}
