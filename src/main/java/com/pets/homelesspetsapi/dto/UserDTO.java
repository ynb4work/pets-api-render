package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Messenger;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Data
public class UserDTO {

    private UUID id;
    private String name;
    private String socialLink;
    private String email;
    private String phoneNumber;
    private Messenger messengerAccount;
    private String city;
    private String userLogo;
    private List<PetCardDTO> favoritePetCards;
    private List<PetCardDTO> ownerPetCards;
}
