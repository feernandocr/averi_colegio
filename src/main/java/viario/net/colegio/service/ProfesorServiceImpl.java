package viario.net.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viario.net.colegio.model.daos.CrudProfesor;
import viario.net.colegio.model.entitys.ProfesorEntity;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorService{
    @Autowired
    CrudProfesor crudProfesor;
    @Override
    public ProfesorEntity createProfesor(ProfesorEntity poProfesor) {
        return crudProfesor.save(poProfesor);
    }

    @Override
    public List<ProfesorEntity> getAllProfesor() {
        return (List<ProfesorEntity>) crudProfesor.findAll();
    }

    @Override
    public ProfesorEntity updateProfesor(ProfesorEntity poProfesor) {
        Optional<ProfesorEntity> loEntity= crudProfesor.findById(poProfesor.getId());
        if (loEntity.isPresent()){
            return crudProfesor.save(poProfesor);
        }else {
            return null;
        }
    }

    @Override
    public Boolean deleteProfesor(Integer idProfesor) {
        Optional<ProfesorEntity> loEntity= crudProfesor.findById(idProfesor);
        if (loEntity.isPresent()){
            crudProfesor.deleteById(idProfesor);
            return true;
        }else {
            return false;
        }
    }
}
