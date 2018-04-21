package com.spring.repositories;

import com.spring.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
