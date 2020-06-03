package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.SkuMaster;

@Repository
public interface SkuMasterRepository extends CrudRepository<SkuMaster, Long>{
	 
}
