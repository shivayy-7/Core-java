import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class How_ToRemoveDuplicateElementFromAnArrayListUsingLinkedHashSet_and_jdk8 {
      public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,6,4,5,7,8,9,0,0,1);
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		List<LinkedHashSet<Integer>> numbersListWithOutDuplicates = Arrays.asList(linkedHashSet);
	    System.out.println(numbersListWithOutDuplicates);
    	
    	  //JDK 8-stream
//     List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,6,4,5,7,8,9,0,0,1);
//     List<Integer> marksListUnique = numbers.stream().distinct().collect(Collectors.toList());
//      System.out.println(marksListUnique);
      }
}
