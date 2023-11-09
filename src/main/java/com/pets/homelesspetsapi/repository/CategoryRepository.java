package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
=======
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
