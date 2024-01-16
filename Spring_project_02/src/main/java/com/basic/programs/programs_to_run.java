package com.basic.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class programs_to_run {
	
@Autowired
arithmetic sum=new arithmetic();

@GetMapping("/add/{a}/{b}")
public int m1(@PathVariable int a,@PathVariable int b) {
	int total=sum.add(a,b);
	return total;
}

@GetMapping("/sub")
public int m2(@RequestParam int a,@RequestParam int b) {
	int total=sum.add(a,b);
	return total;
}

}
