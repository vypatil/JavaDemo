package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Base {
	
	public static void main(String[] args) {
		
		System.out.println("Hellow");
		List <Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
	
		System.out.println(additionOfOddNo(null));
		
	}
	
	public static int additionOfOddNo(List <Integer> l) {
		if(l==null) {
			return 0;
		}
		int sum=0;
		for(Integer a:l) {
			if(!(a%2==0)) {
				
				sum=sum+(a*a);
			}
		}
		return sum;
		
		}
	}

