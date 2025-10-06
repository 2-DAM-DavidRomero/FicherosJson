package semana05.ejemplos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.json
// Spring Boot proporciona integración con tres bibliotecas de mapeo JSON:
//  * Gson
//  * Jackson
//  * JSON-B
// Jackson es la biblioteca preferida y predeterminada en Spring Boot.
public class OperacionesJson {

    private static final Path JSON_READ_FILE_PATH = Path.of(".", "src", "main", "resources", "equipos.json");
    private static final Path JSON_WRITE_FILE_PATH = Path.of(".", "src", "main", "resources", "equiposOutput.json");

    public static List<Equipo> leerEquiposDeJson(Path ruta) {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try (Reader reader = Files.newBufferedReader(ruta)) {
            return objectMapper.readValue(reader, new TypeReference<>() {});
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return List.of();
        }
    }

    public static void escribirEquiposAJson(List<Equipo> equipos, Path ruta) {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);  // Formatear JSON
        try (Writer writer = Files.newBufferedWriter(ruta)) {
            objectMapper.writeValue(writer, equipos);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static List<LocalizacionRickAndMorty> leerLocalizacionesDeRickAndMorty() {
        // https://rickandmortyapi.com/api/location

        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        // Crear un cliente web y una petición GET
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder()
                .uri(URI.create("https://rickandmortyapi.com/api/location"))
                .GET()
                .build();

        try (cliente) {
            // Enviar la petición y recibir la respuesta
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            // Procesar la respuesta como JSON
            JsonNode rootNode = objectMapper.readTree(respuesta.body());
            // Leer y devolver los resultados dentro de "results"
            return objectMapper.readValue(
                    rootNode.get("results").traverse(), new TypeReference<>() {}
            );
        } catch (Exception e) {
            System.out.println("Error en la lectura de la API de Rick&Morty: " + e.getMessage());
            return List.of();
        }
    }

    public static void main(String[] args) {
        // Leer equipos del archivo JSON
        List<Equipo> equipos = leerEquiposDeJson(JSON_READ_FILE_PATH);
        System.out.println("Equipos leídos del archivo JSON:");
        equipos.forEach(System.out::println);

        // Escribir equipos en el archivo JSON
        escribirEquiposAJson(equipos, JSON_WRITE_FILE_PATH);

        // Leer localizaciones de la API de Rick and Morty
        List<LocalizacionRickAndMorty> localizaciones = leerLocalizacionesDeRickAndMorty();
        localizaciones.forEach(System.out::println);

    }
}
