package com.karson.webmagic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("/index")
	public String toindexView() {
		return "index";
		
	}

}
