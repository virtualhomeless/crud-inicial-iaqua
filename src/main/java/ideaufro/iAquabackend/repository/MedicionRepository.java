package ideaufro.iAquabackend.repository;

import ideaufro.iAquabackend.domain.Medicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicionRepository extends JpaRepository<Medicion,Long> {

}
