package Practice.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSum {
public static void main(String[] args) {
	
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
	Integer reduce = integers.stream().reduce(0,(a,b)->a+b);
	System.out.println(reduce);
	Integer sum = integers.stream().reduce(0,Integer::sum);
	System.out.println(sum);
	
	//second type of method
	Integer collect = integers.stream().collect(Collectors.summingInt(Integer::intValue));

System.out.println(collect);

//mapToInt()
int sum2 = integers.stream().mapToInt(Integer::intValue).sum();
System.out.println(sum2);


Item item1 = new Item(1, 10);
Item item2 = new Item(2, 15);
Item item3 = new Item(3, 25);
Item item4 = new Item(4, 40);

List<Item> items = Arrays.asList(item1, item2, item3, item4);

Integer sum3 = items.stream()
.map(x -> x.getPrice())
.reduce(0,  Integer::sum);
System.out.println("sum3::"+sum3);


String string = "Item1 10 Item2 25 Item3 30 Item4 45";
Integer sum4 = Arrays.stream(string.split(" "))
.filter((s) -> s.matches("\\d+"))
.mapToInt(Integer::valueOf)
.sum();

System.out.println("sum4::"+sum4);

}
}
