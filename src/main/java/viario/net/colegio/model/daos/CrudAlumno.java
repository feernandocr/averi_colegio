package viario.net.colegio.model.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import viario.net.colegio.model.entitys.AlumnoEntity;

import java.util.Optional;

@Repository
public interface CrudAlumno extends CrudRepository<AlumnoEntity, Integer> {

}
