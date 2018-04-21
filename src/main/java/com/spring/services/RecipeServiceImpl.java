package com.spring.services;

import com.spring.domain.Recipe;
import com.spring.repositories.RecipeRepository;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Iterable<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
}
