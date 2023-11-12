package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}