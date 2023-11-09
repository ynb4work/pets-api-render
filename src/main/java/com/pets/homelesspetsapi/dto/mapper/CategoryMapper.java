package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
<<<<<<< HEAD

    @Mapping(target = "id", ignore = true)
=======
    @Mapping(target = "id",ignore = true)
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
    Category mapToCategory(CategoryDTO categoryDTO);

    CategoryDTO mapToCategoryDTO(Category category);

    List<CategoryDTO> mapToListCategoryDTO(List<Category> categoryList);
<<<<<<< HEAD
=======

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
}
