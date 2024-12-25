package Business_Logic_Layer;

import Data_Access_Layer.MovieDAO;
import Entity.Movie;

public class MovieService {
    private MovieDAO movieDAO;

    public MovieService() {
        movieDAO = new MovieDAO();
    }

    public boolean addMovie(Movie movie) {
        // 实现添加电影的逻辑
        return movieDAO.saveMovie(movie);
    }

    public boolean updateMovie(Movie movie) {
        // 实现更新电影信息的逻辑
        return movieDAO.updateMovie(movie);
    }

    public Movie getMovieByMovieName(String movieName) {
        // 实现根据电影名称获取电影信息的逻辑
        return movieDAO.getMovieByMovieName(movieName);
    }
}
