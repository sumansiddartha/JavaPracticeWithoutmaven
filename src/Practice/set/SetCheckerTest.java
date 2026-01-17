package Practice.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetCheckerTest {
	
public static void main(String[] args) {
	Set<Integer> setA =setOf(1,2,3,4);
	
	Set<Integer> setB = setOf(2,4,6,8);
	
//	Intersection
  Set<Integer> intersectSet=new HashSet<>(setA);
  intersectSet.retainAll(setB);
  //Streams
  Set<Integer> intSet=setA.stream().filter(setB::contains).collect(Collectors.toSet());
  
  
  System.out.println(intersectSet);
  System.out.println("This is using stream::"+intSet);
//	Union
  Set<Integer> unionSet=new HashSet<>(setA);
  unionSet.addAll(setB);
  
  Set<Integer> uniSet=Stream.concat(setA.stream(), setB.stream()).collect(Collectors.toSet());
  System.out.println("This is using stream union::"+uniSet);
  System.out.println("This is union set:::::"+unionSet);
  
  
//	Relative Complement
  Set<Integer> relComplement=new HashSet<>(setA);
  Set<Integer> relStreamComplement=setA.stream().filter(val->!setB.contains(val)).collect(Collectors.toSet());
	relComplement.removeAll(setB);
	System.out.println("This is relative complement Stream::::"+relStreamComplement);
	System.out.println("This is relative complement::::"+relComplement);
	
}
private static Set<Integer> setOf(Integer... values) {
    return new HashSet<Integer>(Arrays.asList(values));
}
}
