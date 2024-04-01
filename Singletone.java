package AllStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	public class Singletone{
		
		 private static Singletone instance;
		 
		 private Singletone(){
		 }
		 public static Singletone getInstance(){
		       if(instance == null){
			   instance = new Singletone();
			   }
			return instance;
		 }
	public static void main(String[] args) {
		Singletone s = Singletone.getInstance();
		Singletone s1 =Singletone.getInstance();
		
		System.out.println("This is singletone object:" +s);
		System.out.println("This is singletone object:" +s1);
	}

}
