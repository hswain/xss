package com.dell.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
public class DemoController {

	@GetMapping("/hello")
	private String getData(@RequestParam String name) {
		System.out.println(HtmlUtils.htmlEscape(name));
		return HtmlUtils.htmlEscape(name);
	}

	@GetMapping("/test/{name}")
	private String getDataByPath(@PathVariable String name) {
		return name;
	}
}
