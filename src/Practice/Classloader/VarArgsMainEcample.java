package Practice.Classloader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VarArgsMainEcample {
	
	static String firstOfFirst(List<String>... strings) {
		List<Integer> ints=Collections.singletonList(44);
		System.out.println(ints);
		Object[] objects=strings;
		System.out.println(objects);
		objects[0]=ints;
		return strings[0].get(0);
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("1","2","3");
		firstOfFirst(list);
	}

}
