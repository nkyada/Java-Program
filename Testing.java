package AllStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testing {
	
	public static void main(String[] args) {
		
		List<String> al =Arrays.asList("test");
        Map<Integer, Long> finalResult=al.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
	
		           System.out.println("This is the Result:" +finalResult );
		
	}
}
