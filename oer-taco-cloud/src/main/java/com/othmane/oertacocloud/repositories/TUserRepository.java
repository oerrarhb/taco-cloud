package com.othmane.oertacocloud.repositories;

import com.othmane.oertacocloud.data.TUser;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TUserRepository extends MongoRepository<TUser, String> {
    Optional<TUser> findByUsername(String username);
}
