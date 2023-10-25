package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PetCardDTO {

    private Long id;
    private String breed;
    private String color;
    private String name;
    private int age;
    private BigDecimal cost;
    private boolean status;
    private String petCardLogo;
    private Category category;
    private User user;

}
