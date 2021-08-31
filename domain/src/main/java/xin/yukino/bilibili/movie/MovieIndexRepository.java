package xin.yukino.bilibili.movie;

import xin.yukino.bilibili.movie.domain.MovieIndex;
import xin.yukino.bilibili.movie.service.param.MovieIndexQueryParam;

import java.util.List;

public interface MovieIndexRepository {

    List<MovieIndex> queryMovieIndex(MovieIndexQueryParam param);
}
