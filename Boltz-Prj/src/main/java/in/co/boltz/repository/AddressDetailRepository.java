package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.AddressDetail;

@Repository
public interface AddressDetailRepository extends CrudRepository<AddressDetail, Long>{

}
