package com.pets.homelesspetsapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(schema = "pet_clouder", name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id")
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "category_logo", columnDefinition = "TEXT")
    private String categoryLogo;

    @OneToMany(mappedBy = "category")
    private List<PetCard> petCardList;
}





