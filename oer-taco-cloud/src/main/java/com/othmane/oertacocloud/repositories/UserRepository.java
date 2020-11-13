package com.othmane.oertacocloud.repositories;

import com.othmane.oertacocloud.data.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
