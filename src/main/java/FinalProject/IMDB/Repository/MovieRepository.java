package FinalProject.IMDB.Repository;


import FinalProject.IMDB.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findAllByOrderByScoreDesc();
    List<Movie> findAllByOrderByVotersDesc();
}
