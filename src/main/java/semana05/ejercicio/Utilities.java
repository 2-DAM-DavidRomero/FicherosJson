package semana05.ejercicio;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Utilities {



    public static List<Videojuego> leerVideojuegosDesdeJSON(String src) {
        List<Videojuego> listaLectura = new ArrayList<>();

        try {
            ObjectMapper mapeador = new ObjectMapper();

            mapeador.registerModule(new JavaTimeModule());
            mapeador.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            listaLectura = mapeador.readValue(
                    new File(src),
                    new TypeReference<List<Videojuego>>() {}
            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaLectura;
    }


    public static void escribirVideojuegosAJSON(List<Videojuego> videojuegos, String ruta) {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);  // Formatear JSON
        try (Writer writer = Files.newBufferedWriter(new File(ruta).toPath())) {
            objectMapper.writeValue(writer, videojuegos);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
