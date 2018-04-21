package com.spring.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

}
