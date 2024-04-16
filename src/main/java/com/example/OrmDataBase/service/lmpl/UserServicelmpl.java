package com.example.OrmDataBase.service.lmpl;

import com.example.OrmDataBase.model.UserDto;
import com.example.OrmDataBase.model.entity.User;
import com.example.OrmDataBase.repository.UserRepository;
import com.example.OrmDataBase.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //spring bununla clasdaki beanleri gore bilir
@AllArgsConstructor
public class UserServicelmpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll()
                .stream().map();
    }

    @Override
    public UserDto getByid(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
    userRepository.deleteById(id);
    }
}
