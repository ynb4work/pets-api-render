package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.UserDTO;
import com.pets.homelesspetsapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User mapToUser(UserDTO userDTO);

    UserDTO mapToUserDTO(User user);

    List<UserDTO> mapToListUserDTO(List<User> userList);
}
