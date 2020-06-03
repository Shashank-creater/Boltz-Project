package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.OrderStatemaster;

@Repository
public interface OrderStatemasterRepository extends CrudRepository<OrderStatemaster, Long>{

}
