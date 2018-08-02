package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import javax.naming.spi.DirStateFactory.Result;

public class EmpCompare {

	public static void main(String[] args) {
		List<Employee> arr = addEmployeeToList();
		List<Comparator<Employee>> comEmp = addChainComparator();
		
		Comparator<Employee> c3 = (Employee e1, Employee e2)->{
			Stream<Comparator<Employee>> compareStream = comEmp.stream();
			Stream <Comparator<Employee>> getResult = compareStream.filter(chainCompare -> chainCompare.compare(e1, e2)!=0);
			//comEmp.forEach(chainComparator-> chainComparator.compare(e1, e2));
			
		/*for(Comparator<Employee> chainComparator : comEmp){
				int result = chainComparator.compare(e1, e2);
				if(result !=0)
					return result;
			}*/
			return 0;
		};
		
		Collections.sort(arr,c3);
		arr.forEach(empDetails-> System.out.println("Sorted Name "+  empDetails.getEmpId()+"  "+empDetails.getEmpDesignation()+"  "+empDetails.getEmpName()));

		/*Collections.sort(arr,c1);
		for(Employee empe : arr){
			System.out.println("Sorted desognation "+ empe.getEmpId()+"  "+empe.getEmpDesignation()+"  "+empe.getEmpName());
		}		
		arr.forEach(empe -> System.out.println("Sorted desognation "+ empe.getEmpId()+"  "+empe.getEmpDesignation()+"  "+empe.getEmpName()));		
		Collections.sort(arr,c2);
		for(Employee empe : arr)
		System.out.println("Sorted Name "+  empe.getEmpId()+"  "+empe.getEmpDesignation()+"  "+empe.getEmpName());
		*/
		
	}
	
	private static List addChainComparator(){
		List<Comparator<Employee>> comEmp = new ArrayList<>();		
		Comparator<Employee> c1 =  (Employee e1, Employee e2) ->{
			if(!e1.getEmpDesignation().isEmpty() && !e2.getEmpDesignation().isEmpty()){
				return e1.getEmpDesignation().compareTo(e2.getEmpDesignation());
			}			
			return -1;
		};
		Comparator<Employee> c2 =  (Employee e1, Employee e2) ->{
			if(!e1.getEmpName().isEmpty() && !e2.getEmpName().isEmpty()){
				return e1.getEmpName().compareTo(e2.getEmpName());
			}			
			return -1;
		};			
		comEmp.add(c1);
		comEmp.add(c2);
		
		return comEmp;
	}
	
	
	private static List addEmployeeToList(){
		List<Employee> arr = new ArrayList<>();
		Employee obj = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		Employee obj4 = new Employee();
		Employee obj5 = new Employee();
		Employee obj6 = new Employee();
		
		obj.empId= 111;
		obj.empName="abc";
		obj.empDesignation="VP";
		
		obj2.empId= 222;
		obj2.empName="ddd";
		obj2.empDesignation="PM";
		
		obj3.empId= 333;
		obj3.empName="bbb";
		obj3.empDesignation="AVP";
		
		obj4.empId= 444;
		obj4.empName="dff";
		obj4.empDesignation="AVP";
		
		obj5.empId= 555;
		obj5.empName="bcc";
		obj5.empDesignation="PM";
		
		obj6.empId= 666;
		obj6.empName="bee";
		obj6.empDesignation="VP";
		
		
		arr.add(obj6);
		arr.add(obj5);
		arr.add(obj4);
		arr.add(obj3);
		arr.add(obj2);
		arr.add(obj);
		
		return arr;
	}
}
