package com.examples.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.examples.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private ObjectMapper mapper;
//	@GetMapping("/")
	@RequestMapping(value="/")//,method=RequestMethod.GET,produces=MediaType.TEXT_HTML_VALUE)
	public String getUserName(Map<String, Object> model) throws Exception {
		System.out.println("userService.getUserName::"+userService.getUserName());
		model.put("time", new Date());
		model.put("message", "WELCOME TO SPRING BOOT");
		model.put("springUrl", "URL is spring ");
		
		// for user
		model.put("user", mapper.writeValueAsString(userService.getUser()));
		return "index";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET,produces=MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public String getHome() {
		return "HOMEEEEEEEE";
	}
	
	@RequestMapping(value="/home1",method=RequestMethod.GET,produces=MediaType.TEXT_HTML_VALUE)
	public ModelAndView getHome1() {
		Map<String,Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "WELCOME TO SPRING BOOT");
		model.put("springUrl", "URL is spring ");
		
		ModelAndView mav = new ModelAndView("index",model);
		return mav;
	}
	
	@RequestMapping(value= {"/getUser"}, method=RequestMethod.GET)
	@ResponseBody
	public String getUser() throws Exception {
		return mapper.writeValueAsString(userService.getUser());

	}
	
	@RequestMapping(value= {"/getUserFromDB"}, method=RequestMethod.GET)
	@ResponseBody
	public String getUserFromDB() throws Exception {
		return mapper.writeValueAsString(userService.findUser(1));

	}

	
}
