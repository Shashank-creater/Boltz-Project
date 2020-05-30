package com.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.LoginDAO;
import com.entity.UserInfo;

@Controller
/*@SessionAttributes(value="UserDetails",types=UserInfo.class)*/
public class LoginController 
{
	@Autowired
	private LoginDAO login;
	
	@GetMapping(value = {"/"})
	public String welcomeMethod(@ModelAttribute("UserDetails") UserInfo userInfo)
	{
		System.out.println("Controller Calll");
		return "index";
	}
	
	@PostMapping(value= "/register-User")
	public String registerUser(@Valid @ModelAttribute("UserDetails") UserInfo userInfo,BindingResult result)
	{
		//HttpSession session = null;
		System.out.println(result.hasErrors());
		if (result.hasErrors())
		{
			System.out.println("form has error...");
			return "index"; 
			/*redirect:/*/
		}
		
	/*	UserInfo userInfo2 = (UserInfo) session.getAttribute("countrybean");
		System.out.println(userInfo2.getUserName());
*/		
		login.insert(userInfo);
		
		return "success";
	}
	
	@ModelAttribute
	public void message(Model model)
	{
		Map<String, String> l = new HashMap<String, String>();
		l.put("Admin","Admin");
		l.put("DBA","DBA");
		l.put("Manager","Manager");
		model.addAttribute("list", l);
	}
	
/*	@ModelAttribute("UserDetails")
    public UserInfo addAttributes()
	{
		UserInfo country = new UserInfo();
		return country;
    }*/
	
	@ExceptionHandler(NullPointerException.class)
	public String nullPointerHandler(NullPointerException e,Model m)
	{
		System.out.println("Null");
		m.addAttribute("mes", "OOPS Got NullPointerException");
		return "nullPointer";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajaxCall",method=RequestMethod.POST)
	public String ajaxCall(@RequestParam("name") String name)
	{
		System.out.println("Ajax Call = "+name);
		return "ok = "+name;
	}
}
