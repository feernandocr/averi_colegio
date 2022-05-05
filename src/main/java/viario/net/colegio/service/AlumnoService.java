package viario.net.colegio.service;


import viario.net.colegio.model.entitys.AlumnoEntity;

import java.util.List;

public interface AlumnoService {
    public AlumnoEntity createAlumno(AlumnoEntity poAlumno);
    public List<AlumnoEntity> getAllAlumnos();
    public AlumnoEntity updateAlumno(AlumnoEntity poAlumno);
    public Boolean deleteAlumno(Integer idAlumno);
}
