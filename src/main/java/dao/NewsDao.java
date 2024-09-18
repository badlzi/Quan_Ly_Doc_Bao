package dao;

import entity.News;

import java.util.List;

public class NewsDao extends ReadNewspaperDao<News,String> {

    @Override
    public void insert(News entity) {

    }

    @Override
    public void update(News entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public News selectById(String id) {
        return null;
    }

    @Override
    public List<News> selectAll() {
        return List.of();
    }

    @Override
    protected List<News> selectBySql(String sql, Object... args) {
        return List.of();
    }
}
