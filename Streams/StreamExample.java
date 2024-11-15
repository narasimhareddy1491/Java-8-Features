import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample{

    public static void main(String[] args){
    List<Integer> nums = Arrays.asList(12, 5, 7, 2, 4);
      // Create a stream from the list
    Stream<Integer> data = nums. stream();
    long count = data.count();
    System.out.println("total values available  in the list is: " +  count);
    // Sorting the data using stream sorted method
    Stream<Integer> sortData = nums.stream().sorted();
    System.out.println("actual values in the arraylis is :" + nums);
    System.out.println("sorted values using stream method is:");
    sortData.forEach(n -> System.out.println( n));
    // using map() to perform operation like doubling the data
    Stream<Integer> mapData = nums.stream().map(d -> d*2);
    System.out.println("doubling the values in array using map() method");
    mapData.forEach(m -> System.out.print(m + " " + "\n"));
    
    // using filter method to get even numers from the list
     System.out.println("getting even values in array using filter() method");
    nums.stream().filter(a -> a % 2 == 0).sorted().forEach(a -> System.out.println(a));
  }

}
