package com.pets.homelesspetsapi.dto.mapper;

import com.pets.homelesspetsapi.dto.CategoryDTO;
import com.pets.homelesspetsapi.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "id", ignore = true)
    Category mapToCategory(CategoryDTO categoryDTO);

    CategoryDTO mapToCategoryDTO(Category category);

    List<CategoryDTO> mapToListCategoryDTO(List<Category> categoryList);
}
