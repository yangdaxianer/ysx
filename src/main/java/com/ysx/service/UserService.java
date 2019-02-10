package com.ysx.service;


import com.ysx.model.User;
import com.ysx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {




    public User findOne(Integer id){
        Optional<User> byId = userRepository.findById(id);
        return byId.get();
    }
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User addUser(User user){
        User sa = userRepository.save(user);
        return sa;
    }

    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @Transactional
    public User update(User user) {
        User save = userRepository.saveAndFlush(user);
        return save;
    }
}
