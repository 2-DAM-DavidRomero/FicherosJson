package semana05.ejercicio2;

public class Overview {
    private int mapsPlayed;
    private int totalKills;
    private int totalDeaths;
    private int roundsPlayed;
    private double kdRatio;
    private int wins;
    private int draws;
    private int losses;

    public Overview() {}

    public Overview(int mapsPlayed, int totalKills, int totalDeaths, int roundsPlayed, double kdRatio, int wins, int draws, int losses) {
        this.mapsPlayed = mapsPlayed;
        this.totalKills = totalKills;
        this.totalDeaths = totalDeaths;
        this.roundsPlayed = roundsPlayed;
        this.kdRatio = kdRatio;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public int getMapsPlayed() {
        return mapsPlayed;
    }
    public void setMapsPlayed(int mapsPlayed) {
        this.mapsPlayed = mapsPlayed;
    }

    public int getTotalKills() {
        return totalKills;
    }
    public void setTotalKills(int totalKills) {
        this.totalKills = totalKills;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }
    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }
    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public double getKdRatio() {
        return kdRatio;
    }
    public void setKdRatio(double kdRatio) {
        this.kdRatio = kdRatio;
    }

    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
}
