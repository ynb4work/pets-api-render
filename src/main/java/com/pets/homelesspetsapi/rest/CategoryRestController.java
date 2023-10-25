package com.pets.homelesspetsapi.rest;

import com.pets.homelesspetsapi.dto.CategoryDTO;
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
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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
    public List<CategoryDTO> findAll() {

        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO findById(@PathVariable Long id) {

        return categoryService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO, @PathVariable Long id) {

        return categoryService.update(categoryDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable Long id) {

        if (categoryService.findById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found");
        } else {
            categoryService.delete(id);
            return "Category deleted successfully";
        }
    }
}
