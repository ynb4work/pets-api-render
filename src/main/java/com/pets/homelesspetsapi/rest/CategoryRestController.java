package com.pets.homelesspetsapi.rest;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.entity.Category;
import com.pets.homelesspetsapi.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryRestController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO) {

        return categoryService.save(categoryDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> findAll() {

        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category findById(@PathVariable UUID id) {

        return categoryService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO, @PathVariable UUID id) {

        return categoryService.update(categoryDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Category deleted successfully")
    public void delete(@PathVariable UUID id) {

        categoryService.delete(id);
    }
}