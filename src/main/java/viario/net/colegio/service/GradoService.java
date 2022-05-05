package viario.net.colegio.service;

import viario.net.colegio.dto.GradoRequest;
import viario.net.colegio.model.entitys.AlumnoEntity;
import viario.net.colegio.model.entitys.GradoEntity;

import java.util.List;

public interface GradoService {
    public GradoEntity createGrado(GradoRequest poGrado);
    public List<GradoEntity> getAllGrados();
    public GradoEntity updateGrado(GradoRequest poGrado);
    public Boolean deleteGrado(Integer idGrado);
    public List<GradoEntity> getGradosByProfesorId(int piProfesorId);
}
