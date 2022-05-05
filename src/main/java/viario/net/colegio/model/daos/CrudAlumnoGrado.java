package viario.net.colegio.model.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import viario.net.colegio.model.entitys.AlumnoGradoEntity;

@Repository
public interface CrudAlumnoGrado extends CrudRepository<AlumnoGradoEntity, Integer> {
}
