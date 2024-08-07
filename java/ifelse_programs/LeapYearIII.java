package ifelse_programs;
import java.util.*;
public class LeapYearIII {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int year=sc.nextInt();
	        if(year %4 ==0){
	          if(year %100==0){
	             if(year %400==0){
	                 System.out.println(1);
	              }
	              else
	                System.out.println(0);
	              }
	           else
	              System.out.println(1);

	            
	        }
	       else
	         System.out.println(0);


	}

}
/*
 * Problem Description
Given an integer A representing an year, Return 1 if it is a leap year else return 0.

A year is leap year if the following conditions are satisfied:
Year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.


Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A



Output Format
Return 1 if it is a leap year else return 0



Example Input
Input 1

 A = 2020
Input 2:

 A = 1999


Example Output
Output 1

 1
Output 2:

 0


Example Explanation
Explanation 1

 2020 is a leap year as it is a multiple of 4 and not a multiple of 100.
Explanation 2:

 1999 is not a leap year.


 */
