package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long>{

}
