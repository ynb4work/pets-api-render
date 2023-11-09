package com.pets.homelesspetsapi.rest;

import com.pets.homelesspetsapi.dto.CategoryDTO;
<<<<<<< HEAD
import com.pets.homelesspetsapi.entity.Category;
=======
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
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
<<<<<<< HEAD
import java.util.UUID;
=======
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

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
<<<<<<< HEAD
    public List<Category> findAll() {
=======
    public List<CategoryDTO> findAll() {
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
<<<<<<< HEAD
    public Category findById(@PathVariable UUID id) {
=======
    public CategoryDTO findById(@PathVariable Long id) {
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

        return categoryService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
<<<<<<< HEAD
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO, @PathVariable UUID id) {
=======
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO, @PathVariable Long id) {
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

        return categoryService.update(categoryDTO, id);
    }

    @DeleteMapping("/{id}")
<<<<<<< HEAD
    @ResponseStatus(value = HttpStatus.OK, reason = "Category deleted successfully")
    public void delete(@PathVariable UUID id) {

        categoryService.delete(id);
    }
}
=======
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
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
