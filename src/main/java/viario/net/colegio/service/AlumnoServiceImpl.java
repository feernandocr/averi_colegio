package viario.net.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viario.net.colegio.model.daos.CrudAlumno;
import viario.net.colegio.model.entitys.AlumnoEntity;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    CrudAlumno crudAlumno;

    @Override
    public AlumnoEntity createAlumno(AlumnoEntity poAlumno) {
        return crudAlumno.save(poAlumno);
    }

    @Override
    public List<AlumnoEntity> getAllAlumnos() {
        return (List<AlumnoEntity>) crudAlumno.findAll();
    }

    @Override
    public AlumnoEntity updateAlumno(AlumnoEntity poAlumno) {

        Optional<AlumnoEntity> loEntity = crudAlumno.findById(poAlumno.getId());
        if (loEntity.isPresent()){
            return crudAlumno.save(poAlumno);
        }else {
            return null;
        }
    }

    @Override
    public Boolean deleteAlumno(Integer idAlumno) {
        Optional<AlumnoEntity> loEntity = crudAlumno.findById(idAlumno);
        if (loEntity.isPresent()){
             crudAlumno.deleteById(idAlumno);
            return true;
        } else {
            return null;
        }

    }
}
