package com.org;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForeachExample {

	public static void main(String[] args) {

		ArrayList<String> arrObj = new ArrayList<String>();
		arrObj.add("111");
		arrObj.add("222");
		arrObj.add("333");
		arrObj.add("444");
		arrObj.add("555");
		arrObj.add("666");
		
		
		arrObj.forEach(new Consumer<String>(){
			public void accept(String s){
				int i=0;
				System.out.println("This is list with foreach operation"+i+"  "+s);
				
			}
		});
		

		Consumer action = new MyConsumer();
		arrObj.forEach(action);
		
	}

}


class MyConsumer implements Consumer<String>
{
	public void accept(String str){
		System.out.println("This is through consumer class implementation "+ str);
	}
}
