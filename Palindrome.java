package sukhjeet1;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";

		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("This string is palindrome");
		
		else
			System.out.println("This string is not a palindrome");
	}
}