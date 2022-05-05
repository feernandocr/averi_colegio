package viario.net.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viario.net.colegio.dto.AlumnoGradoRequest;
import viario.net.colegio.model.daos.CrudAlumno;
import viario.net.colegio.model.daos.CrudAlumnoGrado;
import viario.net.colegio.model.daos.CrudGrado;
import viario.net.colegio.model.daos.CrudProfesor;
import viario.net.colegio.model.entitys.AlumnoGradoEntity;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoGradoServiceImpl implements AlumnoGradoService{

    @Autowired
    CrudAlumnoGrado crudAlumnoGrado;

    @Autowired
    CrudAlumno crudAlumno;

    @Autowired
    CrudGrado crudGrado;

    @Override
    public AlumnoGradoEntity createAlumnoGrado(AlumnoGradoRequest poAlumnoGrado) {
        AlumnoGradoEntity alumnoGradoEntity = new AlumnoGradoEntity();

        alumnoGradoEntity.setAlumnoid(crudAlumno.findById(poAlumnoGrado.getAlumnoId()).get());
        alumnoGradoEntity.setGradoid(crudGrado.findById(poAlumnoGrado.getGradoId()).get());
        alumnoGradoEntity.setSeccion(poAlumnoGrado.getSeccion());
        return crudAlumnoGrado.save(alumnoGradoEntity);
    }

    @Override
    public List<AlumnoGradoEntity> getAllAlumnoGrados() {
        return (List<AlumnoGradoEntity>) crudAlumnoGrado.findAll();
    }

    @Override
    public AlumnoGradoEntity updateAlumnoGrado(AlumnoGradoRequest poAlumnoGrado) {
        Optional<AlumnoGradoEntity> loEntity = crudAlumnoGrado.findById(poAlumnoGrado.getAlumnoGradoId());
        if (loEntity.isPresent()){
            loEntity.get().setSeccion(poAlumnoGrado.getSeccion());
            loEntity.get().setGradoid(crudGrado.findById(poAlumnoGrado.getGradoId()).get());
            loEntity.get().setAlumnoid(crudAlumno.findById(poAlumnoGrado.getAlumnoId()).get());
            return crudAlumnoGrado.save(loEntity.get());
        }
        return null;
    }

    @Override
    public Boolean deleteAlumnoGrado(Integer idAlumnoGrado) {
        Optional<AlumnoGradoEntity> loEntity = crudAlumnoGrado.findById(idAlumnoGrado);
        if (loEntity.isPresent()){
            crudAlumnoGrado.deleteById(idAlumnoGrado);
            return true;
        }
        return false;
    }
}
