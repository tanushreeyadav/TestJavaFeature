package com.org;

import java.util.Comparator;

public class ComparatorEmp {
	
	Comparator<Employee> c1 =  (Employee e1, Employee e2) ->{
		if(!e1.getEmpDesignation().isEmpty() && !e2.getEmpDesignation().isEmpty()){
			return e1.getEmpDesignation().compareTo(e1.getEmpDesignation());
		}
		
		return -1;
	};
	Comparator<Employee> c2 =  (Employee e1, Employee e2) ->{ 
		if(!e1.getEmpName().isEmpty() && !e2.getEmpName().isEmpty()){
			return e1.getEmpName().compareTo(e1.getEmpName());
		}
		
		return -1;
	};
}
