package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.ProductInfo;

@Repository
public interface ProductInfoRepository extends CrudRepository<ProductInfo, Long>{

}
