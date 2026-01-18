package Practice.Capgemenai;

import java.util.HashSet;

public class TestClass2 {
public static void main(String[] args) {
	HashSet<String> set1=new HashSet<>();
	set1.add("A");
	set1.add("B");
	set1.add("C");
	set1.add("D");
	HashSet<String> set2=new HashSet<>();
	set2.add("D");
	set2.add("B");
	set2.add("C");
	set1.retainAll(set2);
	System.out.println(set1);
}
}
