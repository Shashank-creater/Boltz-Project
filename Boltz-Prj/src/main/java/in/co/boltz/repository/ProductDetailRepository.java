package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.ProductDetail;

@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail, Long>{

}
