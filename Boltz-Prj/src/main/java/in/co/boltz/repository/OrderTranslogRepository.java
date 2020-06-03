package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.OrderTranslog;

@Repository
public interface OrderTranslogRepository extends CrudRepository<OrderTranslog, Long> {

}
