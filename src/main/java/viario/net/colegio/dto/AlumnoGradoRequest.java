package viario.net.colegio.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlumnoGradoRequest {

    @JsonProperty("alumnoGradoId")
    private int alumnoGradoId;

    @JsonProperty("alumnoId")
    private int alumnoId;

    @JsonProperty("gradoId")
    private int gradoId;

    @JsonProperty("seccion")
    private String seccion;

    public int getAlumnoGradoId() {
        return alumnoGradoId;
    }

    public void setAlumnoGradoId(int alumnoGradoId) {
        this.alumnoGradoId = alumnoGradoId;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getGradoId() {
        return gradoId;
    }

    public void setGradoId(int gradoId) {
        this.gradoId = gradoId;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
