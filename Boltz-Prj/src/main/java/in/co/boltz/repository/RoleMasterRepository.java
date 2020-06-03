package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.RoleMaster;

@Repository
public interface RoleMasterRepository extends CrudRepository<RoleMaster, Long>{

}
