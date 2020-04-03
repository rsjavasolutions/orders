package com.rsjavasol.bazajedendowielu;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
