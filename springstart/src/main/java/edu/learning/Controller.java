package edu.learning;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/first",method=RequestMethod.GET)
	//method=RequestMethod.GET this process GET is default
	public String demo()
	{
		return "<body bgcolor='black' text='red'><center><h2>Welcome to Anudip Fo.</h2></center></body>";
	}
	
	@RequestMapping(value="/second")
	//method=RequestMethod.GET this process GET is default
	public String demo2()
	{
		return "<body bgcolor='yellow' text='red'><center><h1>I am Abhijit</h1></center></body>";
	}
	
	
//	@GetMapping("/week/{name}")//path variable--> http://localhost:10000/week/monday------->name=monday
//	public String check(@PathVariable String name)
//	{
//		if(name.equalsIgnoreCase("sunday"))
//		{
//			return "<h1>Its a holiday</h1>";
//		}
//		else
//		{
//			return "<h1>Its a work day!!!</h1>";
//		}
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
