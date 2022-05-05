package viario.net.colegio.model.entitys;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "profesor")
public class ProfesorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprofesor", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 300)
    private String nombre;

    @Column(name = "apellidos", length = 300)
    private String apellidos;

    @Column(name = "genero", length = 45)
    private String genero;

//    @OneToMany(mappedBy = "profesorid")
//    private Set<GradoEntity> grados = new LinkedHashSet<>();

//    public Set<GradoEntity> getGrados() {
//        return grados;
//    }
//
//    public void setGrados(Set<GradoEntity> grados) {
//        this.grados = grados;
//    }

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