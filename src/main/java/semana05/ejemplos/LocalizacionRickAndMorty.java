package semana05.ejemplos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

// https://rickandmortyapi.com/api/location
@Data
public class LocalizacionRickAndMorty {
    private long id;
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("type")
    private String tipo;
    private String dimension;
    @JsonProperty("residents")
    private List<String> residentes;
    private String url;
    @JsonProperty("created")
    private ZonedDateTime fechaCreacion;
}
