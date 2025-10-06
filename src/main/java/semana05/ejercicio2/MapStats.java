package semana05.ejercicio2;

public class MapStats {
    private int wins;
    private int draws;
    private int losses;
    private double winRate;
    private int totalRounds;
    private double roundWinPAfterFirstKill;
    private double roundWinPAfterFirstDeath;

    public MapStats() {
    }

    public MapStats(int wins, int draws, int losses, double winRate, int totalRounds, double roundWinPAfterFirstKill, double roundWinPAfterFirstDeath) {
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.winRate = winRate;
        this.totalRounds = totalRounds;
        this.roundWinPAfterFirstKill = roundWinPAfterFirstKill;
        this.roundWinPAfterFirstDeath = roundWinPAfterFirstDeath;
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

    public double getWinRate() {
        return winRate;
    }
    public void setWinRate(double winRate) {
        this.winRate = winRate;
    }

    public int getTotalRounds() {
        return totalRounds;
    }
    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    public double getRoundWinPAfterFirstKill() {
        return roundWinPAfterFirstKill;
    }
    public void setRoundWinPAfterFirstKill(double roundWinPAfterFirstKill) {
        this.roundWinPAfterFirstKill = roundWinPAfterFirstKill;
    }

    public double getRoundWinPAfterFirstDeath() {
        return roundWinPAfterFirstDeath;
    }
    public void setRoundWinPAfterFirstDeath(double roundWinPAfterFirstDeath) {
        this.roundWinPAfterFirstDeath = roundWinPAfterFirstDeath;
    }
}
