package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.dto.mapper.CategoryMapper;
import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {

        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Transactional
    public CategoryDTO save(CategoryDTO categoryDTO) {

        Category category = categoryMapper.mapToCategory(categoryDTO);
        Category savedCategory = categoryRepository.save(category);

        return categoryMapper.mapToCategoryDTO(savedCategory);
    }

    public Category findById(UUID id) {

        return categoryRepository.findById(id).
                orElseThrow(() -> new RuntimeException("ID not found"));
    }

    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    @Transactional
    public CategoryDTO update(CategoryDTO categoryDTO, UUID id) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
        categoryDTO.setId(id);

        return categoryDTO;
    }

    @Transactional
    public void delete(UUID id) {

        findById(id);
        categoryRepository.deleteById(id);
    }
}