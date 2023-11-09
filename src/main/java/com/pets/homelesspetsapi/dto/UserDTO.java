package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Messenger;
<<<<<<< HEAD
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Data
public class UserDTO {

    private UUID id;
=======
import com.pets.homelesspetsapi.entity.PetCard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Long id;
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    private String name;
    private String socialLink;
    private String email;
    private String phoneNumber;
    private Messenger messengerAccount;
    private String city;
    private String userLogo;
<<<<<<< HEAD
    private List<PetCardDTO> favoritePetCards;
    private List<PetCardDTO> ownerPetCards;
=======
    private List<PetCard> favoritePetCards;
    private List<PetCard> ownerPetCards;

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
}
