package com.tomaszgasior.spring.web.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tomaszgasior.spring.web.dao.Offer;
import com.tomaszgasior.spring.web.dao.OffersDAO;
import com.tomaszgasior.spring.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	
	


	/*@RequestMapping("/")
	public ModelAndView showHome(){
		
		ModelAndView mv = new ModelAndView("home");
		
		Map<String, Object> model = mv.getModel();
		
		model.put("name", "River");
		
		return mv;
		}
		*/
	@RequestMapping("/")
	public String showHome(Model model){
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "home";
	

	}
}
