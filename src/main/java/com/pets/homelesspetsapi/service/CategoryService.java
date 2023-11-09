package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.dto.mapper.CategoryMapper;
import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.repository.CategoryRepository;
import jakarta.transaction.Transactional;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
=======
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

<<<<<<< HEAD
    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {

        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Transactional
=======
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    public CategoryDTO save(CategoryDTO categoryDTO) {

        Category category = categoryMapper.mapToCategory(categoryDTO);
        Category savedCategory = categoryRepository.save(category);
<<<<<<< HEAD

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
=======
        return categoryMapper.mapToCategoryDTO(savedCategory);
    }

    public CategoryDTO findById(Long id) {

        Category category = categoryRepository.findById(id).
                orElseThrow(() -> new RuntimeException("ID not found"));
        return categoryMapper.mapToCategoryDTO(category);
    }

    public List<CategoryDTO> findAll() {

        List<Category> categoryList = categoryRepository.findAll();
        return categoryMapper.mapToListCategoryDTO(categoryList);
    }

    @Transactional
    public CategoryDTO update(CategoryDTO categoryDTO, Long id) {

        categoryRepository.findById(id).
                orElseThrow(() -> new RuntimeException("ID not found"));

        Category updateCategory = categoryMapper.mapToCategory(categoryDTO);
        updateCategory.setId(id);

        return (CategoryDTO) categoryMapper.mapToCategoryDTO(updateCategory);
    }

    public void delete(Long id) {

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
        categoryRepository.deleteById(id);
    }
}