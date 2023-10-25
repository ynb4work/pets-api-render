package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.UserDTO;
import com.pets.homelesspetsapi.dto.mapper.UserMapper;
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
    private final UserMapper userMapper;

    @Transactional
    public UserDTO save(UserDTO userDTO) {

        User user = userMapper.mapToUser(userDTO);
        User savedUser = userRepository.save(user);

        return userMapper.mapToUserDTO(savedUser);
    }

    public UserDTO findById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        return userMapper.mapToUserDTO(user);
    }

    public List<UserDTO> findAll() {

        List<User> allUsers = userRepository.findAll();

        return userMapper.mapToListUserDTO(allUsers);
    }

    @Transactional
    public UserDTO update(UserDTO userDTO, Long id) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        userDTO.setId(id);
        User updatedUser = userRepository.save(userMapper.mapToUser(userDTO));

        return userMapper.mapToUserDTO(updatedUser);
    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }
}

