package com.basic.collection;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calling {
@PostMapping("/list")
List l1(@RequestBody code obj) {
	return obj.l();
}
}
