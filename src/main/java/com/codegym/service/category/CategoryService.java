package com.codegym.service.category;

import com.codegym.model.Category;

public interface CategoryService {

    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
