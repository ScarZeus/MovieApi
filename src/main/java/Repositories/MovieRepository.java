package Repositories;

import Entity.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface MovieRepository extends JpaRepository<MovieModel,Integer> {
}
