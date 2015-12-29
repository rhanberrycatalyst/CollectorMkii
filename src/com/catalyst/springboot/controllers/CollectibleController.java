package com.catalyst.springboot.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contoller 
 */
@Controller
public class CollectibleController {
	
	/**
	 * Get Index
	 * index page contains entire front-end 
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String collectibleIndex(){
		return "collectible-index.html";
	}
	
}
