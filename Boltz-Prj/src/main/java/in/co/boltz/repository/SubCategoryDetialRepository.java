package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.SubCategoryDetial;

@Repository
public interface SubCategoryDetialRepository extends CrudRepository<SubCategoryDetial, Long> {

}
