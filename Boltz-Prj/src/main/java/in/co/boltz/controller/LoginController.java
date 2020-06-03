package in.co.boltz.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.co.boltz.entity.UserDetail;
import in.co.boltz.service.UserDetailService;

@Controller
public class LoginController 
{
	@Autowired
	private UserDetailService userDetailService;
	
	@RequestMapping(value="/loginpage")
	public String loginPage(@ModelAttribute("userDetails") UserDetail userDetail)
	{
			return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginUser(@Valid @ModelAttribute("userDetails") UserDetail userDetail,BindingResult result)
	{/*
		List loginData    = null; ;
		Object[] userData = null;
		loginData = userDetailDao.loginUser(userName, password);
		
		if(loginData!= null && loginData.size() > 0)
		{
			userData = (Object[])loginData.get(0);
			
			if(userData != null)
			{
				httpSession.setAttribute("userName", userData[0] != null && !"".equals(userData[0]) ?userData[0] :userData[1]);
				return "index";	
			}
			else
			{
				model.addAttribute("messaage","UserName And Password Is Not Valid ");
				return "loginpage";
			}
				 
		}
		else
		{
			model.addAttribute("messaage","UserName And Password Is Not Valid ");
			return "loginpage";
		}
	*/
		if(result.hasErrors())
		{
			return "login";
		}
		return null;
	}
	
	@RequestMapping(value="/registerpage")
	public String registerPage(HttpSession httpSession,@ModelAttribute("userDetails") UserDetail userDetail)
	{
			return "register";
	}
	
	@RequestMapping(value="/registeruser",method=RequestMethod.POST)
	
	public String rgisterUser(@Valid @ModelAttribute("userDetails") UserDetail userDetail,BindingResult errors)
	{
		if (errors.hasErrors()) 
		{
			return "register";
		}
		
		userDetailService.saveUser(userDetail);
		return "index";
	}
}
