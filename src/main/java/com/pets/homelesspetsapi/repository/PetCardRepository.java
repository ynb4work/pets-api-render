package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.PetCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PetCardRepository extends JpaRepository<PetCard, UUID> {
}
