package xin.yukino.bilibili.repository;

import org.springframework.stereotype.Component;
import xin.yukino.bilibili.movie.MovieIndexRepository;
import xin.yukino.bilibili.movie.domain.MovieIndex;
import xin.yukino.bilibili.movie.service.param.MovieIndexQueryParam;

import java.util.List;

@Component
public class MovieIndexRepositoryImpl implements MovieIndexRepository {

    @Override
    public List<MovieIndex> queryMovieIndex(MovieIndexQueryParam param) {
        return null;
    }
}
