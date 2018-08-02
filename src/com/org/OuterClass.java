package com.org;

public class OuterClass{

    private int pri;
    protected int pro;
    
   
    public class innerclasses{

        public innerclasses()
        {

        	int a = pri+pro;       	    

        }

    }
    
    public static void main(String []args){
    	
    	OuterClass obj = new OuterClass();
    	
    }

}