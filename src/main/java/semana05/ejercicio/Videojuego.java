package semana05.ejercicio;

import java.time.LocalDate;
import java.util.List;

public class Videojuego {
    private String title;
    private Platforma platform;
    private String genre;
    private List<Desarrollador> developers;
    private LocalDate releaseDate;
    private List<Review> reviews;

    public Videojuego() {
    }

    public Videojuego(String title, Platforma platform, String genre, List<Desarrollador> developers, LocalDate releaseDate, List<Review> reviews) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.developers = developers;
        this.releaseDate = releaseDate;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platforma getPlatform() {
        return platform;
    }

    public void setPlatform(Platforma platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Desarrollador> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Desarrollador> developers) {
        this.developers = developers;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Title='" + title + '\n' +
                ", platform=" + platform.toString() + "\n"+
                ", genre='" + genre + '\n' +
                ", developers=" + developers.toString() + "\n" +
                ", releaseDate=" + releaseDate + "\n" +
                ", reviews=" + reviews.toString() +"\n";
    }
}
