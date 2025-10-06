package semana05.ejercicio;

import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 1. Leer el fichero JSON e imprimir los videojuegos iniciales.
        List<Videojuego> videojuegos = Utilities.leerVideojuegosDesdeJSON("src/main/resources/videogames.json");
        System.out.println("Lista de videojuegos inicial:");
        videojuegos.forEach(System.out::println);

        // 2. Crear un nuevo videojuego y añadirlo a la lista.
        Videojuego nuevoJuego = crearNuevoVideojuego();
        videojuegos.add(nuevoJuego);
        System.out.println("\nVideojuego añadido:");
        System.out.println(nuevoJuego);

        // 3. Serializar la lista actualizada de videojuegos de nuevo a un archivo JSON.
        Utilities.escribirVideojuegosAJSON(videojuegos, "src/main/resources/videojuegos_actualizados.json");
        System.out.println("\nVideojuegos serializados en 'videojuegos_actualizados.json'.");
    }

    // Función auxiliar para crear un nuevo videojuego
    private static Videojuego crearNuevoVideojuego() {
        Platforma plataforma = new Platforma("PlayStation 5", "Sony");
        Desarrollador desarrollador = new Desarrollador("Naughty Dog", "United States");
        List<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(desarrollador);

        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("Incredible visuals and story.", LocalDate.of(2022, 8, 5), 5));
        reviews.add(new Review("Best graphics ever!", LocalDate.of(2022, 9, 15), 5));

        return new Videojuego("The Last of Us Part II",
                plataforma,
                "Action",
                desarrolladores,
                LocalDate.of(2020, 6, 19),
                reviews);
    }
}

