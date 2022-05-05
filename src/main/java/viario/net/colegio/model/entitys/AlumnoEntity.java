package viario.net.colegio.model.entitys;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "alumno")
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 300)
    private String nombre;

    @Column(name = "apellidos", length = 300)
    private String apellidos;

    @Column(name = "genero", length = 45)
    private String genero;

    @Column(name = "fecha_nacimiento", length = 45)
    private String fechaNacimiento;

    @OneToMany(mappedBy = "alumnoid")
    private Set<AlumnoGradoEntity> alumnoGrados = new LinkedHashSet<>();

    public Set<AlumnoGradoEntity> getAlumnoGrados() {
        return alumnoGrados;
    }

    public void setAlumnoGrados(Set<AlumnoGradoEntity> alumnoGrados) {
        this.alumnoGrados = alumnoGrados;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}