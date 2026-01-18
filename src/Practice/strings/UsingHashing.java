package Practice.strings;

public class UsingHashing {
	static int Frequency[]=new int[26];

	static int hashFunc(char c) {
		return (c-'a');
	}
	
	
	///normal method to get the frequency
	static void frequency(String s) {
		for(char c = 'a';c <= 'z';++c) {
			int frequency=0;
			for(int i=0;i<s.length();++i) {
				if(s.charAt(i)==c) {
					frequency++;
				}
					
			}
			System.out.println(c+"==="+frequency);
			
		}
	}
	//using hash table
	static void countFreq(String s) {
		for(int i=0;i<s.length();++i) {
			int index=hashFunc(s.charAt(i));
			System.out.println("This is index::::"+index);
			Frequency[index]++;
			
		}
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+'a')+":::::::::::::"+Frequency[i]);
		}
	}
	
	public static void main(String[] args) {
		String str="abcceeeaaaderffffccddeetthhjjjjjakkkammmamammamamamzzz";
//		frequency(str);
		
		countFreq(str);
	}

}
