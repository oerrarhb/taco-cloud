package com.othmane.oertacocloud.repositories;

import com.othmane.oertacocloud.data.Taco;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TacoRepository extends MongoRepository<Taco, String> {
}
