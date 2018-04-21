package com.spring.services;

import com.spring.domain.Recipe;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface RecipeService {
    Iterable<Recipe> getAllRecipes();
}
