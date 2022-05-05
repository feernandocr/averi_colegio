package viario.net.colegio.service;

import viario.net.colegio.model.entitys.ProfesorEntity;

import java.util.List;

public interface ProfesorService {
    public ProfesorEntity createProfesor(ProfesorEntity poProfesor);
    public List<ProfesorEntity> getAllProfesor();
    public ProfesorEntity updateProfesor(ProfesorEntity poProfesor);
    public Boolean deleteProfesor(Integer idProfesor);
}
