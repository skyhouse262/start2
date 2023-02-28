package com.test.start2.tester;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test1")
@RestController
@ResponseBody
public class TestController {
	
	@RequestMapping("main")
	public String main() {
		return "mainiswork";
	}
}
