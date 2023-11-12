package com.pets.homelesspetsapi.repository;

import com.pets.homelesspetsapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}

