package viario.net.colegio.model.entitys;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "grado", indexes = {
        @Index(name = "profesorid_idx", columnList = "profesorid")
})
public class GradoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgrado", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 300)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesorid")
    private ProfesorEntity profesorid;

    @OneToMany(mappedBy = "gradoid")
    private Set<AlumnoGradoEntity> alumnoGrados = new LinkedHashSet<>();

    public Set<AlumnoGradoEntity> getAlumnoGrados() {
        return alumnoGrados;
    }

    public void setAlumnoGrados(Set<AlumnoGradoEntity> alumnoGrados) {
        this.alumnoGrados = alumnoGrados;
    }

    public ProfesorEntity getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(ProfesorEntity profesorid) {
        this.profesorid = profesorid;
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