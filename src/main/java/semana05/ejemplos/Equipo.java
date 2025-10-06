package semana05.ejemplos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Equipo {
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("nationality")
    private String nacionalidad;
    @JsonProperty("drivers")
    private List<Piloto> pilotos;
}
