package viario.net.colegio.service;

import viario.net.colegio.dto.AlumnoGradoRequest;
import viario.net.colegio.model.entitys.AlumnoGradoEntity;
import viario.net.colegio.model.entitys.GradoEntity;

import java.util.List;

public interface AlumnoGradoService {
    public AlumnoGradoEntity createAlumnoGrado(AlumnoGradoRequest poAlumnoGrado);
    public List<AlumnoGradoEntity> getAllAlumnoGrados();
    public AlumnoGradoEntity updateAlumnoGrado(AlumnoGradoRequest poAlumnoGrado);
    public Boolean deleteAlumnoGrado(Integer idAlumnoGrado);
}
