package viario.net.colegio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viario.net.colegio.dto.AlumnoGradoRequest;
import viario.net.colegio.dto.GradoRequest;
import viario.net.colegio.model.entitys.AlumnoEntity;
import viario.net.colegio.model.entitys.AlumnoGradoEntity;
import viario.net.colegio.model.entitys.GradoEntity;
import viario.net.colegio.model.entitys.ProfesorEntity;
import viario.net.colegio.service.AlumnoGradoService;
import viario.net.colegio.service.AlumnoService;
import viario.net.colegio.service.GradoService;
import viario.net.colegio.service.ProfesorService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/colegio")
public class ColegioController {

    @Autowired
    AlumnoService alumnoService;

    @Autowired
    ProfesorService profesorService;

    @Autowired
    GradoService gradoService;

    @Autowired
    AlumnoGradoService alumnoGradoService;

    @GetMapping(value = "/test")
    public String test() {
        return "Esto es una prueba test";
    }

    @PostMapping(value = "/alumno/newAlumno")
    public AlumnoEntity newAlumno(@RequestBody AlumnoEntity poAlumnoRequest) {
        return alumnoService.createAlumno(poAlumnoRequest);
    }

    @GetMapping(value = "/alumno/getAlumnos")
    public List<AlumnoEntity> getAllAlumnos() {
        return alumnoService.getAllAlumnos();
    }

    @PutMapping(value = "/alumno/updateAlumno")
    public AlumnoEntity updateAlumno(@RequestBody AlumnoEntity poAlumnoRequest) {
        return alumnoService.updateAlumno(poAlumnoRequest);
    }

    @DeleteMapping(value = "/alumnno/deleteAlumno/{idAlumno}")
    public Map<String, Boolean> deleteAlumno(@PathVariable(value = "idAlumno") Integer idAlumno) {
        Map<String, Boolean> response = new HashMap<>();
        if (alumnoService.deleteAlumno(idAlumno)) {
            response.put("DELETED", Boolean.TRUE);
        } else {
            response.put("ERROR", Boolean.FALSE);
        }
        return response;
    }

    /* PROFESOR */
    @PostMapping(value = "/profesor/newProfesor")
    public ProfesorEntity newProfesor(@RequestBody ProfesorEntity poProfRequest) {
        return profesorService.createProfesor(poProfRequest);
    }

    @GetMapping(value = "/profesor/getProfesores")
    public List<ProfesorEntity> getAllProfesores() {
        return profesorService.getAllProfesor();
    }

    @PutMapping(value = "/profesor/updateProfesor")
    public ProfesorEntity updateAlumno(@RequestBody ProfesorEntity poProfRequest) {
        return profesorService.updateProfesor(poProfRequest);
    }

    @DeleteMapping(value = "/profesor/deleteProfesor/{idProfesor}")
    public Map<String, Boolean> deleteProfesor(@PathVariable(value = "idProfesor") Integer piIdProfesor) {
        Map<String, Boolean> response = new HashMap<>();
        if (profesorService.deleteProfesor(piIdProfesor)) {
            response.put("DELETED", Boolean.TRUE);
        } else {
            response.put("ERROR", Boolean.FALSE);
        }
        return response;
    }

    /*Grado*/
    @PostMapping(value = "/grado/newGrado")
    public GradoEntity newGrado(@RequestBody GradoRequest poGradoRequest) {
        return gradoService.createGrado(poGradoRequest);
    }

    @GetMapping(value = "/grado/getGrados")
    public List<GradoEntity> getGrados() {
        return gradoService.getAllGrados();
    }

    @PutMapping(value = "/grado/updateGrado")
    public GradoEntity updateGrado(@RequestBody GradoRequest poGradoRequest) {
        return gradoService.updateGrado(poGradoRequest);
    }

    @DeleteMapping(value = "/grado/deleteGrado/{idGrado}")
    public Map<String, Boolean> deleteGrado(@PathVariable(value = "idGrado") Integer piIdProfesor) {
        Map<String, Boolean> response = new HashMap<>();
        if (profesorService.deleteProfesor(piIdProfesor)) {
            response.put("DELETED", Boolean.TRUE);
        } else {
            response.put("ERROR", Boolean.FALSE);
        }
        return response;
    }

    /*AlumnoGrado*/
    @PostMapping(value = "/alumnogrado/newAlumnoGrado")
    public AlumnoGradoEntity newAlumnoGrado(AlumnoGradoRequest poAlumnoGradoRequest) {
        return alumnoGradoService.createAlumnoGrado(poAlumnoGradoRequest);
    }

    @GetMapping(value = "/alumnogrado/getAlumnoGrados")
    public List<AlumnoGradoEntity> getAlumnoGrados() {
        return alumnoGradoService.getAllAlumnoGrados();
    }

    @PutMapping(value = "/alumnogrado/updateGrado")
    public AlumnoGradoEntity updateAlumnoGrado(@RequestBody AlumnoGradoRequest poAlumnoGradoRequest) {
        return alumnoGradoService.updateAlumnoGrado(poAlumnoGradoRequest);
    }


    /*Consultas customizadas*/
    @GetMapping("/profesor/getGradosByProfesorId/{idProfesor}")
    public List<GradoEntity> getGradosByProfesorId(@PathVariable(value = "idProfesor") int idProfesor){
        return gradoService.getGradosByProfesorId(idProfesor);
    }
}