package com.spring.repositories;

import com.spring.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
