package reponsitory;

import models.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUser();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    List<User> findByCountry(String country);

    List<User> findByName(String name);

    List<User> sort(String name);

    List<User> viewAll();

    void updateSp(User user);

    void deleteSp(int id);
}
