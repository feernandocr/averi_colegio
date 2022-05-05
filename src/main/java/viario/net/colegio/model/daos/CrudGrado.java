package viario.net.colegio.model.daos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import viario.net.colegio.model.entitys.GradoEntity;
import viario.net.colegio.model.entitys.ProfesorEntity;

import java.util.List;

@Repository
public interface CrudGrado extends CrudRepository<GradoEntity, Integer> {

    @Query("SELECT g FROM GradoEntity g where g.profesorid= :idProfesor")
    public List<GradoEntity> getGradosByProfesorId(@Param(value ="idProfesor") ProfesorEntity idProfesor);
}
