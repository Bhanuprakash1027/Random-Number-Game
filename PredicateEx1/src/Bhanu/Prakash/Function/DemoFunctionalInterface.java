package Bhanu.Prakash.Function;

import java.util.ArrayList;
import java.util.function.Function;

public class DemoFunctionalInterface {
	String name;
	int salary;
	long adhar;
	String Adderess;
	


	public DemoFunctionalInterface(String name, int salary, long adhar, String adderess) {
		super();
		this.name = name;
		this.salary = salary;
		this.adhar = adhar;
		Adderess = adderess;
	}



	public static void main(String[] args) {
		
		ArrayList<DemoFunctionalInterface> al= new ArrayList<DemoFunctionalInterface>();
		al.add(new DemoFunctionalInterface("bhanu", 15000, 1234567890, "guntur"));
		al.add(new DemoFunctionalInterface("prakash", (int) 25000.0, 1234567890, "guntur"));

		Function<DemoFunctionalInterface, Integer> f=e-> {
			int salary=e.salary;
		if(salary>10000) {
			return(salary*5/100);
		}
		return salary;
		};
		
		for(DemoFunctionalInterface d:al) {
			int bonus =f.apply(d);
			System.out.println(d.salary+" "+ bonus);
		}
	}

}
