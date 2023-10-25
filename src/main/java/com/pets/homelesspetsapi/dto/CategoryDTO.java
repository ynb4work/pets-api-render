package com.pets.homelesspetsapi.dto;

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
public class CategoryDTO {

    private Long id;
    private String title;
    private String categoryLogo;
    private List<PetCard> petCardList;

}
