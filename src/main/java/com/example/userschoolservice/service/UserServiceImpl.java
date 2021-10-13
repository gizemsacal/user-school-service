package com.example.userschoolservice.service;

import com.example.userschoolservice.model.User;
import com.example.userschoolservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository  userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public User updateUser(User newUser, Integer id) {
      User oldUser = userRepository.findById(id).get();
        oldUser.setFirstName(newUser.getFirstName());
        oldUser.setLastName(newUser.getLastName());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setBirthDay(newUser.getBirthDay());
     return userRepository.save(oldUser);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = userRepository.findById(id).get();
         userRepository.delete(user);
    }

    @Override
    public User getUserByUserName(String name) {
        return userRepository.getByUsername(name);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
