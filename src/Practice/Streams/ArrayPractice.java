package Practice.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayPractice {
	static int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };
	static String[] strings = new String[] { "aearning", "java", "with", "baeldung" };
	
	//Checking the sorting using comparable 
	static boolean isSorted(Comparable[] array) {
		 for (int i = 0; i < array.length - 1; ++i) {
		        if (array[i].compareTo(array[i + 1]) > 0)
		            return false;
		    }
		    return true;
		
	}
	
	public static void main(String[] args) {
		int[] numbers2= {5,-6,8,4,-5,3,1,-1,-10};
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		Stream<Integer> boxed = IntStream.of(numbers2).boxed();
		int[] array = boxed.sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println(strings[3].compareTo(strings[0])>0);
		  List<Employee> employees = new ArrayList<Employee>();
		   employees.add(new Employee(10, "Ramesh", 30, 400000));
	        employees.add(new Employee(20, "John", 29, 350000));
	        employees.add(new Employee(30, "Tom", 30, 450000));
	        employees.add(new Employee(40, "Pramod", 29, 500000));
	        employees.add(new Employee(40, "Pramod", 29, 500000));
	    
	        
	        Stream<String> stream=employees.stream()
	        							.flatMap(detail -> detail.getName().chars()
	        									.mapToObj(c -> String.valueOf((char)c))
	        									);
	        String collect2 = stream.collect(Collectors.joining("==="));
	        System.out.println("----------------------");
	        System.out.println(collect2);
	     Employee Ramesh=new Employee(10, "Ramesh", 30, 400000);
	     Employee John=new Employee(20, "John", 29, 350000);
	     Employee  Tom=new Employee(30, "Tom", 30, 450000);
	     Employee  Pramod =new Employee(40, "Pramod", 29, 500000);
	     
	     Employee[] employeesArray= {Ramesh,John,Tom,Pramod};
	        
	        
		
		Arrays.sort(numbers);
		//Arrays in descending order
		numbers=IntStream.of(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
		
		System.out.print("{");
		for(int number:numbers) {
			System.out.print(number);
			
			System.out.print(", ");
		}
		System.out.println("}");
		
		
		Arrays.sort(employeesArray,Comparator.comparing(Employee::getName).reversed());
		for(Employee emp:employeesArray) {
			System.out.println(emp);
		}
		String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
		// Gives undesired output:
		System.out.println(Arrays.toString(deepArray));
		// Gives the desired output:
		System.out.println(Arrays.deepToString(deepArray));
		
		long count = employees.stream().distinct().count();
		System.out.println(count);
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		Stream<String> stream2 = list.stream()
									.filter(element -> element.contains("d")||element.contains("D"));
		List<String> collect = stream2.collect(Collectors.toList());
		System.out.println("This is start");
		for(String element:collect) {
			
			System.out.println(element);
		}
		
	}

}
