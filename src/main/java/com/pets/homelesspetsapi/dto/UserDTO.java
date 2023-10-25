package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Messenger;
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
    private String name;
    private String socialLink;
    private String email;
    private String phoneNumber;
    private Messenger messengerAccount;
    private String city;
    private String userLogo;
    private List<PetCard> favoritePetCards;
    private List<PetCard> ownerPetCards;

}
