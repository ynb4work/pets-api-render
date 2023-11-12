package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.PetCard;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Data
public class CategoryDTO {

    private UUID id;
    private String title;
    private String categoryLogo;
    private List<PetCard> petCardList;
}

