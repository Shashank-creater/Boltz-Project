package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.CategoryDetails;

@Repository
public interface CategoryDetailsRepository extends CrudRepository<CategoryDetails, Long>{

}
