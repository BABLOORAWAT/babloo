package dao;

import java.util.List;
import model.Users;

public interface UsersDAO {
    
    void insert(Users u);
    void update(Users u);
    void delete(int uid);
    boolean getUsers(String email);
    Users getUsers(int uid);
    List<Users> getUsers();
    boolean checkLogin(String email, String password);
}
