package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.PetCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetCardRepository extends JpaRepository<PetCard, Long> {

}
