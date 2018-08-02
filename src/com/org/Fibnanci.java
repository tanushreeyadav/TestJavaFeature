package com.org;

import java.util.ArrayList;
import java.util.List;

public class Fibnanci {

	public static int fib(int n)
	{
		if(n<2)
		{
			return n;
		}
		else 
			return fib(n-1)+fib(n-2);
		
	}
	public static void main(String[] args) {
	/*	int n=6;
		int f;
		f=fib(6);
		System.out.println("term"+f);
		*/
		List list = testListAdd();
		list.forEach(item -> System.out.println(item));
		
		//ACTIVE
        System.out.println(UserStatus.ACTIVE);
        
        }

	public enum UserStatus {
	    PENDING ("1"),
	    ACTIVE("22"),
	    INACTIVE("33"),
	    DELETED("44");
		
		private final String status;
		
		UserStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
		
			return status;
		}
	}
	
	
	public static void testList( List list){
		list.add("1");
		list.add("2");
	}
	
	public static List testListAdd(){
		List list = new ArrayList<String>();
		list.add("n");
		testList(list);
		return list;
	}
}
