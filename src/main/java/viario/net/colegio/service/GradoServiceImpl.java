package viario.net.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viario.net.colegio.dto.GradoRequest;
import viario.net.colegio.model.daos.CrudGrado;
import viario.net.colegio.model.daos.CrudProfesor;
import viario.net.colegio.model.entitys.GradoEntity;


import java.util.List;
import java.util.Optional;

@Service
public class GradoServiceImpl implements GradoService{
    @Autowired
    CrudGrado crudGrado;

    @Autowired
    CrudProfesor crudProfesor;

    @Override
    public GradoEntity createGrado(GradoRequest poGrado) {
        GradoEntity gradoEntity  = new GradoEntity();
        gradoEntity.setNombre(poGrado.getNombreGrado());
        gradoEntity.setProfesorid(crudProfesor.findById(poGrado.getProfesorId()).get());
        return crudGrado.save(gradoEntity);
    }

    @Override
    public List<GradoEntity> getAllGrados() {
        return (List<GradoEntity>) crudGrado.findAll();
    }

    @Override
    public GradoEntity updateGrado(GradoRequest poGrado) {
        Optional<GradoEntity> loEntity = crudGrado.findById(poGrado.getIdGrado());
        if (loEntity.isPresent()){
            loEntity.get().setNombre(poGrado.getNombreGrado());
            loEntity.get().setProfesorid(crudProfesor.findById(poGrado.getProfesorId()).get());
           return crudGrado.save(loEntity.get());
        }else{
            return null;
        }
    }

    @Override
    public Boolean deleteGrado(Integer idGrado) {
        Optional<GradoEntity> loEntity = crudGrado.findById(idGrado);
        if (loEntity.isPresent()){
            crudGrado.deleteById(idGrado);
            return true;
        }else{
            return null;
        }
    }

    @Override
    public List<GradoEntity> getGradosByProfesorId(int piProfesorId) {
        return crudGrado.getGradosByProfesorId(crudProfesor.findById(piProfesorId).get());
    }

}
