package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteDao {
    public Favorite findByRidAndUid(int rid, int uid);

    int findCountByRid(int rid);

    void add(int i, int uid);
}
