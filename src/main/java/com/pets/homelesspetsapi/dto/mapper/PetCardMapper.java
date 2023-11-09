package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.entity.PetCard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetCardMapper {
<<<<<<< HEAD

=======
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    @Mapping(target = "id", ignore = true)
    PetCard mapToPetCard(PetCardDTO petCardDTO);

    PetCardDTO mapToPetCardDTO(PetCard petCard);

    List<PetCardDTO> mapToListPetCardDTO(List<PetCard> petCardList);
<<<<<<< HEAD
}
=======
}
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
