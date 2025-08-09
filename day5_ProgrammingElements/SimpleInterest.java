package day5_ProgrammingElements;

import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		SimpleInterest ob=new SimpleInterest();
		ob.takeInput();
	}
	public void takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		double principle=sc.nextDouble();
		System.out.println("Enter rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter Time: ");
		double time=sc.nextDouble();
		System.out.println("Simple Interest: "+calculateSimpleInterest(principle,rate,time));
	}
	public double calculateSimpleInterest(double principle,double rate,double time){
		double simpleInterest=(principle*rate*time)/100;
		return simpleInterest;
	}
}
