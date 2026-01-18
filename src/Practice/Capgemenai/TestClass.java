package Practice.Capgemenai;

import java.util.Scanner;

public class TestClass {

//	Write a program to print all combination of the given String. 
//
//	Examples:
//
//	If the String is : ABC, Combinations are : ABC, BCA, CAB, CBA, BAC, ACB
//
//	If the String is : 
//		
//		
//		
//		ABCD, Combinations are : ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA CABD CADB CBAD CBDA CDAB CDBA DABC DACB DBAC DBCA DCAB DCBA
	
	public static void StringCombinations(String str) {
		
		
		int left=0;
		int right=0;
		str.toCharArray();
//		char temp=str.charAt(i);
//		str.charAt(i)=str.charAt(i+1);
//		str.charAt(i+1)=temp;
		int strlength=str.length();
		for(char s:str.toCharArray()) {
			System.out.print(s);
		}
			
			
			strlength--;
		
		while(strlength>0) {
			}
		
//		for(int i=0;i<=str.length();i++) {
//			
//
//		}
		
		
	}
	private static void permute(String str,String result) {
		if(str.length()==0) {
			System.out.println(result+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			String remaining=str.substring(0,i)+str.substring(i+1);
			permute(remaining,result+currentChar);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		
		permute(str,"");
	}
}
