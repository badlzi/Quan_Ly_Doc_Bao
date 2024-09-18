package dao;

import entity.NewsLetters;

import java.util.List;

public class NewSlettersDao extends ReadNewspaperDao<NewsLetters, String>{
    @Override
    public void insert(NewsLetters entity) {

    }

    @Override
    public void update(NewsLetters entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public NewsLetters selectById(String id) {
        return null;
    }

    @Override
    public List<NewsLetters> selectAll() {
        return List.of();
    }

    @Override
    protected List<NewsLetters> selectBySql(String sql, Object... args) {
        return List.of();
    }
}
