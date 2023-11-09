package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.UserDTO;
import com.pets.homelesspetsapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
<<<<<<< HEAD

    @Mapping(target = "id", ignore = true)
=======
    @Mapping(target = "id",ignore = true)
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    User mapToUser(UserDTO userDTO);

    UserDTO mapToUserDTO(User user);

    List<UserDTO> mapToListUserDTO(List<User> userList);
<<<<<<< HEAD
=======

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
}
