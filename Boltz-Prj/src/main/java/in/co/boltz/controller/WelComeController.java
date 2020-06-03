package in.co.boltz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.co.boltz.entity.ProductBanner;
import in.co.boltz.entity.UserDetail;
import in.co.boltz.service.ProductBannerService;

@Controller
public class WelComeController 
{
	@Autowired
	private ProductBannerService productBannerService;
	
	@Value("${welcome.message}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("bannerInfo", productBannerService.getActiveProductBannerDDetail());
		//List<ProductBanner>  l = productBannerService.getActiveProductBannerDDetail();
		return "index";
	}
	
	@RequestMapping("/homepage")
	public String welcomePage(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}
	
	@RequestMapping("/privacypage")
	public String privacyPage()
	{
		return "privacyPolicy";
	}
	
	@RequestMapping("/termsandcondtionpage")
	public String termsAndCondtion()
	{
		return "termsAndCondition";
	}
	
	@RequestMapping("/productPage")
	public String productPage()
	{
		return "productPage";
	}

}
