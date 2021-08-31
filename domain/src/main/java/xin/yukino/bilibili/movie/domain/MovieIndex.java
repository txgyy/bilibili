package xin.yukino.bilibili.movie.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MovieIndex {

    /**
     * 版权类型: 独家; 会员专享
     */
    private String badge;

    /**
     * 版权类型: 1; 0
     */
    private int badgeType;

    /**
     * 封面: http://i0.hdslb.com/bfs/bangumi/image/db6c0af1b1d2ab073c080e43c154978a5cbf01c3.jpg
     */
    private String cover;

    /**
     * 上映时间: 2020-09-25上映
     */
    private String indexShow;

    /**
     * 是否完结: 1; 0
     */
    private int isFinish;

    /**
     * 播放链接: https://www.bilibili.com/bangumi/play/ss34353?theme=movie
     */
    private String link;


    private int mediaId;
    private String order;
    private String orderType;
    private int seasonId;
    private int seasonType;
    private String title;
    private String titleIcon;
}
