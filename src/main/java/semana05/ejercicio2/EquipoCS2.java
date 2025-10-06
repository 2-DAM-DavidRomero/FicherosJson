package semana05.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EquipoCS2 {
    private int id;
    private String name;
    private Overview overview;
    private List<Match> matches;
    private List<Player> currentLineup;
    private List<Player> historicPlayers;
    private List<Player> standins;
    private List<Player> substitutes;
    private List<EventResult> events;
    private Map<String, MapStats> mapStats;

    public EquipoCS2() {
    }

    public EquipoCS2(int id, String name, Overview overview, ArrayList<Match> matches, ArrayList<Player> currentLineup, ArrayList<Player> historicPlayers, ArrayList<Player> standins, ArrayList<Player> substitutes, ArrayList<EventResult> events, Map<String, MapStats> mapStats) {
        this.id = id;
        this.name = name;
        this.overview = overview;
        this.matches = matches;
        this.currentLineup = currentLineup;
        this.historicPlayers = historicPlayers;
        this.standins = standins;
        this.substitutes = substitutes;
        this.events = events;
        this.mapStats = mapStats;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Overview getOverview() {
        return overview;
    }
    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public List<Match> getMatches() {
        return matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public List<Player> getCurrentLineup() {
        return currentLineup;
    }
    public void setCurrentLineup(List<Player> currentLineup) {
        this.currentLineup = currentLineup;
    }

    public List<Player> getHistoricPlayers() {
        return historicPlayers;
    }
    public void setHistoricPlayers(List<Player> historicPlayers) {
        this.historicPlayers = historicPlayers;
    }

    public List<Player> getStandins() {
        return standins;
    }
    public void setStandins(List<Player> standins) {
        this.standins = standins;
    }

    public List<Player> getSubstitutes() {
        return substitutes;
    }
    public void setSubstitutes(List<Player> substitutes) {
        this.substitutes = substitutes;
    }

    public List<EventResult> getEvents() {
        return events;
    }
    public void setEvents(List<EventResult> events) {
        this.events = events;
    }

    public Map<String, MapStats> getMapStats() {
        return mapStats;
    }
    public void setMapStats(Map<String, MapStats> mapStats) {
        this.mapStats = mapStats;
    }

    @Override
    public String toString() {
        return "EquipoCS2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
