package pl.videopoint.carservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IssuesController {

	@RequestMapping("/**")
	@ResponseBody
	public String test(){
		return "My first view!";
	}
}
