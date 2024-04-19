package com.devtonin.graalvmpoc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String graalTest() {
		return "Teste poc GraalVM!";
	}
}