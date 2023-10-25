package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.dto.mapper.CategoryMapper;
import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryDTO save(CategoryDTO categoryDTO) {

        Category category = categoryMapper.mapToCategory(categoryDTO);
        Category savedCategory = categoryRepository.save(category);
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

        categoryRepository.deleteById(id);
    }
}