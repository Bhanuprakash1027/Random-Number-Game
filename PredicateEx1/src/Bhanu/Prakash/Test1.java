package Bhanu.Prakash;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test1 {
	static int a[] = {20,22,45,47,56,234};
	
	public static void main(String[] args) {
		/*Predicate<Integer> p=a->(a>18);
		System.out.println(p.test(5));*/
		
		/*Predicate<Integer> pre=a->(a%2==0);
		Predicate<Integer> pre2=i->(i>25);
		
		for(int n:a) {
			if(pre.test(n)&pre2.test(n)) {
				System.out.println(n);
			}
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String h=sc.next();
		Predicate<String> s=i->h.isEmpty();
		ArrayList<String> al=new ArrayList<String>();
		
		al.add(h);
		for(String n:al) {
			System.out.println(s.test(h)+ " filled with "+h.length());
			sc.close();
		}
		
	}
	

}
