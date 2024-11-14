package Services;

import Entity.MovieModel;
import Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieModel addMovie(MovieModel movieModel) {
        return movieRepository.save(movieModel);
    }

    public List<MovieModel> getAllMovies() {
        return movieRepository.findAll();
    }
    public Optional<MovieModel> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }
    public void updateMovie(MovieModel movieModel) {
         movieRepository.save(movieModel);
    }

}

