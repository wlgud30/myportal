package com.bitacademy.myportal.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/main")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/WEB-INF/views/home.jsp");
		
		return mv;
	}
}
