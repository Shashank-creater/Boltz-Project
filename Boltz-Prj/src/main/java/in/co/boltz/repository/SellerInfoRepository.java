package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.SellerInfo;

@Repository
public interface SellerInfoRepository extends CrudRepository<SellerInfo, Long> {

}
