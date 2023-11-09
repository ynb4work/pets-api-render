package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.PetCard;
<<<<<<< HEAD
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

=======
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
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
