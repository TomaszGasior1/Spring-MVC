package com.tomaszgasior.spring.web.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomaszgasior.spring.web.dao.Offer;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome(Model model) {

		return "home";

	}
}
