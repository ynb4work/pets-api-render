package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.UserDTO;
import com.pets.homelesspetsapi.dto.mapper.UserMapper;
import com.pets.homelesspetsapi.entity.User;
import com.pets.homelesspetsapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {

        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Transactional
    public UserDTO save(UserDTO userDTO) {

        validation(userDTO);

        User user = userMapper.mapToUser(userDTO);
        User savedUser = userRepository.save(user);

        return userMapper.mapToUserDTO(savedUser);
    }

    public UserDTO findById(UUID id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        return userMapper.mapToUserDTO(user);
    }

    public List<UserDTO> findAll() {

        List<User> allUsers = userRepository.findAll();

        return userMapper.mapToListUserDTO(allUsers);
    }

    @Transactional
    public UserDTO update(UserDTO userDTO, UUID id) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        validation(userDTO);

        String takeEmail = userDTO.getEmail();
        existingUser.setEmail(takeEmail);

        String takePhoneNumber = userDTO.getPhoneNumber();
        existingUser.setPhoneNumber(takePhoneNumber);

        userDTO.setId(id);

        return userDTO;
    }

    @Transactional
    public void delete(UUID id) {

        findById(id);
        userRepository.deleteById(id);
    }

    public void deleteAll() {

        userRepository.deleteAll();
    }

    private void validation(UserDTO userDTO) {

        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern patternEmail = Pattern.compile(EMAIL_REGEX);

        String PHONE_NUMBER_REGEX = "^\\+380\\d{9}$";
        Pattern patternPhoneNumber = Pattern.compile(PHONE_NUMBER_REGEX);

        String email = userDTO.getEmail();
        String phoneNumber = userDTO.getPhoneNumber();

        Matcher matcherEmail = patternEmail.matcher(email);
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(phoneNumber);

        if (matcherEmail.matches() && matcherPhoneNumber.matches() && phoneNumber.length() == 13) {
            userDTO.setEmail(email);
            User user = userMapper.mapToUser(userDTO);
            userRepository.save(user);
            System.out.println("Email and Phone number is valid");
        } else {
            throw new RuntimeException("Email or Phone number is not valid");
        }
    }
}
