package in.co.boltz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.ProductBanner;

@Repository
public interface ProductBannerRepository extends CrudRepository<ProductBanner, Long>{
	public List<ProductBanner> findByIsActive(String active);
}
