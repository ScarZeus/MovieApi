package Entity;

import jakarta.persistence.*;
import org.hibernate.dialect.function.array.JsonArrayViaElementArgumentReturnTypeResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
public class MovieModel {
    @Id
    private int movieId;
    private String movieName;
    private String movieYear;
    @ElementCollection(targetClass=ArrayList.class,fetch = FetchType.EAGER)
    private List<String> movieGenre ;
    private String movieDirector;
    @ElementCollection(targetClass=ArrayList.class,fetch = FetchType.EAGER)
    private List<String> movieCast;

    @Override
    public String toString() {
        return "MovieModel{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieYear='" + movieYear + '\'' +
                ", movieGenre=" + movieGenre +
                ", movieDirector='" + movieDirector + '\'' +
                ", movieCast=" + movieCast +
                '}';
    }

    public List<String> getMovieCast() {
        return movieCast;
    }

    public void setMovieCast(List<String> movieCast) {
        this.movieCast = movieCast;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public List<String> getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(List<String> movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


}
