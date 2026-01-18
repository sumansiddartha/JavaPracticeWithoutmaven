package Practice.Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<Word, String> table = new Hashtable<>();
		Word word = new Word("cat");
		table.put(word, "an animal");
		table.put(new Word("dog"), "another animal");
		System.out.println(table.get(word));
		System.out.println(table.get(new Word("cat")));
		String extracted = table.get(new Word("cat"));
		
		Iterator<Word> it=table.keySet().iterator();
//		table.remove(new Word("dog"));   we will get ConcurrentModificationException thread is iterating through the table, and another one is trying to modify it at the same time
		while(it.hasNext()) {
			Word key = it.next();
			System.out.println(key);
		}
		
		Hashtable<Word, String> table1 = new Hashtable<Word, String>();
		table1.put(new Word("1"), "one");
		table1.put(new Word("2"), "two");
		table1.put(new Word("3"), "three");
		Enumeration<Word> enumKey = table1.keys();
		table1.remove(new Word("1"));
		while (enumKey.hasMoreElements()) {
		    Word key = enumKey.nextElement();
		    System.out.println(key);
		}

	}

}
