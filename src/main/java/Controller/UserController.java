package Controller;

import DAO.Impl.UserDaoImpl;
import DAO.UserDao;
import pojo.Users;

/**
 * @author te9uila
 * @since 2023/7/18
 */
public class UserController {
    UserDao userDao = new UserDaoImpl();

    public boolean userLogin(String username,String password){
        Users users = new Users();
        users.setPassword(password);
        users.setUsername(username);
        return userDao.userLogin(users);
    }
    public boolean userRegister(String username){
        return false;
    }
}
