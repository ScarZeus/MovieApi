package Controller;

import Entity.MovieModel;
import Entity.UserLogins;
import Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Component
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<UserLogins> addMovie(@RequestBody MovieModel movie) {
        movieService.addMovie(movie);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getAllMovie")
    public ResponseEntity<List<MovieModel>> getAllMovie() {
      List<MovieModel> movie=  movieService.getAllMovies();
      return new ResponseEntity<>(movie,HttpStatus.OK);
    }

    @PutMapping("/{movie}/delete")
    public ResponseEntity<UserLogins> deleteMovie(@PathVariable("movie") int movieId) {
        movieService.deleteMovie(movieId);
        return new ResponseEntity<>(HttpStatus.OK);
    }







}
