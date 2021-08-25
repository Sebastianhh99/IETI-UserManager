package co.escuelaing.ieti.rest.service;

import java.util.List;

import co.escuelaing.ieti.rest.data.User;
import co.escuelaing.ieti.rest.dto.UserDto;

public interface UserService {
    User create(UserDto user);

    User findById(int id);

    List<User> all();

    void deleteById(int id);

    User update(UserDto user, int userId);
}
