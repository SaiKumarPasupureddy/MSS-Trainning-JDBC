package com.basic.collection;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@PostMapping("/map")
	public HashMap<String,String> obj(@RequestBody mapping ob){
		return ob.map();
	}
}
