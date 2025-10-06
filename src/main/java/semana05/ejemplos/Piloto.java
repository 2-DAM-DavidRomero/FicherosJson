package semana05.ejemplos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Piloto {
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("number")
    private int numero;
    @JsonProperty("birthDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")  // Especifica el formato de la fecha
    private LocalDate fechaNacimiento;
    @JsonProperty("nationality")
    private String nacionalidad;
}
