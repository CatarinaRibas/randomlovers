package services;

import model.User;

import java.util.Map;
import java.util.Set;


public class UserService {

    private Map<Integer,User> userList;

    public void addUser(User user) {
        userList.put(user.getId(), user);
    }

    public User getUserById(Integer id) {
        return userList.get(id);
    }

    public boolean validateUser(String username, String password) {

        Set<Integer> idSet = userList.keySet();
        for (Integer id : idSet) {

            User user = getUserById(id);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    // getters && setters
    public void setUserList(Map<Integer, User> userList) {
        this.userList = userList;
    }

}
