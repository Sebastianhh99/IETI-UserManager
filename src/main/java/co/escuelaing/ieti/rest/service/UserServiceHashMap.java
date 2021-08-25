package co.escuelaing.ieti.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import co.escuelaing.ieti.rest.data.User;
import co.escuelaing.ieti.rest.dto.UserDto;

@Service
public class UserServiceHashMap implements UserService {

    private static HashMap<Integer,User> users = new HashMap<>();

    @Override
    public User create(UserDto user) {
        User newUser = new User(user,users.size()+1);
        users.put(newUser.getId(), newUser);
        return newUser;
    }

    @Override
    public User findById(int id) {
        User user = users.containsKey(id) ? users.get(id):null;
        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public void deleteById(int id) {
        users.remove(id);
    }

    @Override
    public User update(UserDto user, int userId) {
        User newUser = new User(user,userId);
        users.put(userId, newUser);
        return newUser;
    }
    
}
