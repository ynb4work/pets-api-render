package com.pets.homelesspetsapi.rest;

import com.pets.homelesspetsapi.dto.UserDTO;
import com.pets.homelesspetsapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO save(@RequestBody UserDTO userDTO) {

        return userService.save(userDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAll() {

        return userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO findById(@PathVariable UUID id) {

        return userService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO update(@RequestBody UserDTO userDTO, @PathVariable UUID id) {

        return userService.update(userDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "User deleted successfully")
    public void delete(@PathVariable UUID id) {

        userService.delete(id);
    }

    @DeleteMapping("/all")
    @ResponseStatus(value = HttpStatus.OK, reason = "Users deleted successfully")
    public void delete() {

        userService.deleteAll();
    }
}