package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@RequiredArgsConstructor
@Data
public class PetCardDTO {

    private UUID id;
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
