package com.basic.programs;

import org.springframework.stereotype.Service;

@Service
public class arithmetic {
	int add(int a,int b) {
		return a+b;
	}
	
	int sub(int a,int b) {
		return a-b;
	}
	
	int mul(int a,int b) {
		return a*b;
	}
}
