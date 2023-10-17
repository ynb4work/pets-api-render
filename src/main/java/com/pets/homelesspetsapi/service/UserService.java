package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.entity.User;
import com.pets.homelesspetsapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {

        return userRepository.save(user);
    }

    public User findById(Long id) {

        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
    }

    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Transactional
    public User update(User user, Long id) {

        userRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
        user.setId(id);
        return userRepository.save(user);
    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }

}

