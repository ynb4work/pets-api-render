package com.pets.homelesspetsapi.dto;

import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.entity.User;
<<<<<<< HEAD
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@RequiredArgsConstructor
@Data
public class PetCardDTO {

    private UUID id;
=======
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
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    private String breed;
    private String color;
    private String name;
    private int age;
    private BigDecimal cost;
    private boolean status;
    private String petCardLogo;
    private Category category;
    private User user;
<<<<<<< HEAD
=======

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
}
