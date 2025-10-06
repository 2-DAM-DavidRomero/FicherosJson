package semana05.ejercicio2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import semana05.ejemplos.LocalizacionRickAndMorty;
import semana05.ejercicio.Videojuego;

import java.io.File;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;


public class Utilities {

    public static EquipoCS2 leerFichaEquipoCS2HLTV(String nombreEquipo) {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        HttpClient cliente = HttpClient.newHttpClient();
        try {
            String encodedName = URLEncoder.encode(nombreEquipo, StandardCharsets.UTF_8);
            HttpRequest peticion = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:3000/teamStatsByName/" + encodedName))
                    .GET()
                    .build();

            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            //System.out.println("Respuesta de la API: " + respuesta.body());
            if (respuesta.body() == null || respuesta.body().isBlank()) {
                System.out.println("⚠ La API devolvió vacío");
                return null;
            }

            return objectMapper.readValue(respuesta.body(), EquipoCS2.class);

        } catch (Exception e) {
            System.out.println("Error en la lectura de la API: " + e.getMessage());
            return null;
        }
    }


    public static EquipoCS2 leerEquiposDesdeJSON(String src) {
        EquipoCS2 listaLectura;
        try {
            ObjectMapper mapeador = new ObjectMapper();

            // 👇 Registrar soporte para LocalDate
            mapeador.registerModule(new JavaTimeModule());
            mapeador.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            listaLectura = mapeador.readValue(
                    new File(src),
                    new TypeReference<>() {}
            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaLectura;
    }





}
