// package Day2_ProgrammingElements;
import java.util.*;
public class VotingEligibility{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ages[]=new int[n];
		for(int i=0; i<n; i++) {
			ages[i]=sc.nextInt();
		}
		
		for(int age:ages) {
			if(age<0) {
				System.out.print("Invalid age");
			}
			else if(age>=18) {
				System.out.println("The student with the age "+age+" can vote");
			}
			else {
				System.out.println("The student with the age "+age+" cannot vote");
			}
		}

	}

}
