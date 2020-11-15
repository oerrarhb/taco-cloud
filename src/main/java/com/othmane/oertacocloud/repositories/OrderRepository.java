package com.othmane.oertacocloud.repositories;

import com.othmane.oertacocloud.data.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
