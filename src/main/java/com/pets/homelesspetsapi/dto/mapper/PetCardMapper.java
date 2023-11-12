package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.entity.PetCard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetCardMapper {

    @Mapping(target = "id", ignore = true)
    PetCard mapToPetCard(PetCardDTO petCardDTO);

    PetCardDTO mapToPetCardDTO(PetCard petCard);

    List<PetCardDTO> mapToListPetCardDTO(List<PetCard> petCardList);
}