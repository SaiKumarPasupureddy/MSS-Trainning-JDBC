package com.basic.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class mapping {
	int a;
	int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public HashMap<String,String> map(){
		HashMap m=new HashMap();
		try {
			int c=a/b;
			m.put("output", ""+c);
		}
		catch(Exception e) {
			m.put("exception", e.getMessage());
		}
		return m;
	}

}
