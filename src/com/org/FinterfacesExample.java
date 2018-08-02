package com.org;


@FunctionalInterface
 interface Interface1{
	
	void method1();
	default int log(){
		System.out.println("this is interface one");
		return 0;
	}
	
	default int log1(){
		System.out.println("this is interface onedfjskldjflksdjlkf");
		return 0;
	}
}


@FunctionalInterface
 interface Interface2{
	
	void method1();
	default void log(){
		System.out.println("this is interface 2");
	}
}


public class FinterfacesExample implements Interface1//, Interface2
{

	public static void main(String[] args) {
		FinterfacesExample obj = new FinterfacesExample();
		//obj.log();
		
		//Interface1 obj2 = new FinterfacesExample();
		//obj2.log();	
		
		Interface1 i1 = () ->{
			System.out.println("This is lambda on functional interface from main class");
		};
			i1.method1();
		
	//	obj.method1();

	}

	@Override
	public void method1() {
		Interface1 i1 = () ->{
			System.out.println("This is lambda on functional interface ");
		};
			i1.method1();
	}

/*	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public int log() {
		// TODO Auto-generated method stub
	return Interface1.super.log();
	//Interface2.super.log();
		
	}
	
	
}
