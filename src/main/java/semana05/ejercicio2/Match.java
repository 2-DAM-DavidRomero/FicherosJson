package semana05.ejercicio2;

import java.util.Map;

public class Match {
    private long date;
    private Event event;
    private Team team1;
    private Team team2;
    private String map;
    private int mapStatsId;
    private Result result;

    public Match(){

    }

    public Match(int date, Event event, Team team1, Team team2, String map, int mapStatsId, Result result) {
        this.date = date;
        this.event = event;
        this.team1 = team1;
        this.team2 = team2;
        this.map = map;
        this.mapStatsId = mapStatsId;
        this.result = result;
    }

    public long getDate() {
        return date;
    }
    public void setDate(long date) {
        this.date = date;
    }

    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }

    public Team getTeam1() {
        return team1;
    }
    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }
    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getMap() {
        return map;
    }
    public void setMap(String map) {
        this.map = map;
    }

    public int getMapStatsId() {
        return mapStatsId;
    }
    public void setMapStatsId(int mapStatsId) {
        this.mapStatsId = mapStatsId;
    }

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
}
