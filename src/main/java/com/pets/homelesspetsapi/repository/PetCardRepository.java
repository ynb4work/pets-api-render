package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.PetCard;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.UUID;

public interface PetCardRepository extends JpaRepository<PetCard, UUID> {
=======
public interface PetCardRepository extends JpaRepository<PetCard, Long> {

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
}
