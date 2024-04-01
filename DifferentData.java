package AllStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DifferentData 
{
	
	int [] number= {1,2,3,4,5,6};
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	String str = "Hello, Nayan Devani!";
	IntStream duplicate= Arrays.stream(number);
	
	public static void main(String[] args) {
        DifferentData data = new DifferentData();
        data.printData();
	}
	
	public void printData() {
        System.out.println("Array:");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println("\nList:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\nString: " + str);
        System.out.println("IntStream:");
        duplicate.forEach(System.out::println);
    }
}
