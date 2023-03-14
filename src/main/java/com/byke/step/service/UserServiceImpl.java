package com.byke.step.service;

import com.byke.step.model.User;
import com.byke.step.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User userRequest) {

        return userRepository.save(userRequest);
    }
}
