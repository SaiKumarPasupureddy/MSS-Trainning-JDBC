package com.basic.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class code {
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

	List l() {
		List al=new ArrayList();
		try{
			int c=a/b;
			al.add(c);
		}
		catch(Exception e) {
			al.add(e.getMessage());
		}
		return al;
	}

}
