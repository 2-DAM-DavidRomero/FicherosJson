package semana05.ejercicio;

import java.time.LocalDate;

public class Review {
    private String comment;
    private LocalDate date;
    private int rating;

    public Review() {
    }

    public Review(String comment, LocalDate date, int rating) {
        this.comment = comment;
        this.date = date;
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Comment='" + comment + '\'' +
                ", date=" + date +
                ", rating=" + rating;
    }
}
