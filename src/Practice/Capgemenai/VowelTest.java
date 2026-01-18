package Practice.Capgemenai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelTest {
	
	public static int solution(int n,String s) {
		
		int maxVowelLength=0;
		int currentVowelLength=0;
		for(char c:s.toCharArray()) {
			if(isVowel(c)) {
				currentVowelLength++;
			}else {
				maxVowelLength=Math.max(maxVowelLength, currentVowelLength);
				currentVowelLength=0;
				
			}
		}
		maxVowelLength=Math.max(maxVowelLength, currentVowelLength);
		return maxVowelLength;
		
		
	}
	private static boolean isVowel(char c) {
		System.out.println("This is the character "+c+" .This is the status::::"+"aeiouAEIOU".indexOf(c));
		return "aeiouAEIOU".indexOf(c)!=-1;
	}
	
	
	
	
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(bufferedReader.readLine().trim());
	
	String s=bufferedReader.readLine();
	int result=VowelTest.solution(n,s);
	System.out.println(String.valueOf(result));
	bufferedReader.close();
}
}
