package viario.net.colegio.model.entitys;

import javax.persistence.*;

@Entity
@Table(name = "alumno_grado", indexes = {
        @Index(name = "gradoid_idx", columnList = "gradoid"),
        @Index(name = "alumnoid_idx", columnList = "alumnoid")
})
public class AlumnoGradoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno_grado", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "alumnoid")
    private AlumnoEntity alumnoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gradoid")
    private GradoEntity gradoid;

    @Column(name = "seccion", length = 300)
    private String seccion;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public GradoEntity getGradoid() {
        return gradoid;
    }

    public void setGradoid(GradoEntity gradoid) {
        this.gradoid = gradoid;
    }

    public AlumnoEntity getAlumnoid() {
        return alumnoid;
    }

    public void setAlumnoid(AlumnoEntity alumnoid) {
        this.alumnoid = alumnoid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}