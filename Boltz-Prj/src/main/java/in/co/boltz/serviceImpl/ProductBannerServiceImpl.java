package in.co.boltz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.boltz.entity.ProductBanner;
import in.co.boltz.repository.ProductBannerRepository;
import in.co.boltz.service.ProductBannerService;

@Service
public class ProductBannerServiceImpl implements ProductBannerService{

	@Autowired
	private ProductBannerRepository productBannerRepository;
	
	@Override
	public List<ProductBanner> getActiveProductBannerDDetail() {
		
		List<ProductBanner> bannerDetailList = productBannerRepository.findByIsActive("Y");
 		return bannerDetailList;
	}

}
