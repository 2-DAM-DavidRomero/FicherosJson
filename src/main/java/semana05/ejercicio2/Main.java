package semana05.ejercicio2;


public class Main {
    public static void main(String[] args) {

        EquipoCS2 equipo = Utilities.leerFichaEquipoCS2HLTV("Gentle Mates");
        if ( equipo  == null){
            //Fecha del contenido del json: 06/10/2025
            equipo = Utilities.leerEquiposDesdeJSON("src/main/resources/GentleMatesOutput.json");
        } else {
            Utilities.escribirEquipoJSON(equipo, "src/main/resources/GentleMatesOutput.json");
        }
        System.out.println(equipo);
    }
}
