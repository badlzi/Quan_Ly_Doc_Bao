package dao;

import entity.Categories;

import java.util.List;

public class CategoriesDao extends ReadNewspaperDao<Categories,String>{
    @Override
    public void insert(Categories entity) {

    }

    @Override
    public void update(Categories entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Categories selectById(String id) {
        return null;
    }

    @Override
    public List<Categories> selectAll() {
        return List.of();
    }

    @Override
    protected List<Categories> selectBySql(String sql, Object... args) {
        return List.of();
    }
}
