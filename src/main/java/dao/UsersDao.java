package dao;

import entity.Users;

import java.util.List;

public class UsersDao extends ReadNewspaperDao<Users,String> {
    @Override
    public void insert(Users entity) {
        
    }

    @Override
    public void update(Users entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Users selectById(String id) {
        return null;
    }

    @Override
    public List<Users> selectAll() {
        return List.of();
    }

    @Override
    protected List<Users> selectBySql(String sql, Object... args) {
        return List.of();
    }
}
