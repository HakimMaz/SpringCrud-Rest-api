package io.javabrain.springbootstarter.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseApiAppController {

	 @RequestMapping("/hello")
	 public String SayHello()
	 {
		
		 
		 return "hello Spring";
	 }
}
