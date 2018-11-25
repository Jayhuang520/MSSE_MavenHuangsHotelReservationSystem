//package com.huangshotelreservationsystem.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.huangshotelreservationsystem.business.LoginManager;
//import com.huangshotelreservationsystem.model.domain.CustomerBean;
//import com.huangshotelreservationsystem.model.domain.LoginBean;
//
//@Controller
//public class LoginController {
//	
//	@RequestMapping(value="/login",method=RequestMethod.GET)
//	public String login(Model model) {
//		LoginBean loginBean = new LoginBean();
//		
//		model.addAttribute("login",loginBean);
//		return "login";
//	}
//	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public String login(LoginBean loginBean,Model model) {
//		CustomerBean customerBean = new LoginManager().authenticateLogin(loginBean);
//		
//		if(customerBean == null) {
//			return "login";
//		}else {
//			model.addAttribute("customer",customerBean);
//			return "customerHome";
//		}
//		
//	}
//	
//}
