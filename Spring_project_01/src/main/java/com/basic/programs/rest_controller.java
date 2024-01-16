package com.basic.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest_controller {
@Autowired
	add o=new add();
@GetMapping("add/{a}/{b}")
public int add(@PathVariable int a,@PathVariable int b) {
	int total=o.sum(a,b);
	return total;
}


@GetMapping("/sub")
public int sub(@RequestParam int a,@RequestParam int b) {
	int total=o.s(a,b);
	return total;
}
}
