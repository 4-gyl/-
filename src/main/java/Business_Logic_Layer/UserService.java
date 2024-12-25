package Business_Logic_Layer;

import Data_Access_Layer.UserDAO;
import Entity.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

    public boolean registerUser(User user) {
        // 实现用户注册逻辑
        return userDAO.saveUser(user);
    }

    public boolean loginUser(String username, String password) {
        // 实现用户登录逻辑
        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public User getUserByUsername(String username) {
        // 实现根据用户名获取用户信息的逻辑
        return userDAO.getUserByUsername(username);
    }

    public boolean updateUser(User user) {
        // 实现更新用户信息的逻辑
        return userDAO.updateUser(user);
    }
}
