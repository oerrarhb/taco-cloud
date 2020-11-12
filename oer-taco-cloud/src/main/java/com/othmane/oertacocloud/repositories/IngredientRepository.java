package com.othmane.oertacocloud.repositories;

import com.othmane.oertacocloud.data.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
