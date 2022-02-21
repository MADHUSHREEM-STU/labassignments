package lamdaassignments;

import java.util.*;
import java.util.stream.Collectors;
class lab9exp4 {
	public static void main(String[] args) {
		List<String> strings = Arrays
			    .asList("Rohan", "Jony", "Pinky", "Anil", "Suresh", "Swaroop", "Chandana");
			 
//			List<String> sorted = strings
//			    .stream()
//			    .sorted((s1, s2) -> s1.compareTo(s2))
//			    .collect(Collectors.toList());
			 
			System.out.println("before sorting using method refrence: "+strings);
			 
			List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
			 
			System.out.println("after sorting using method reference: "+sortedAlt);
	}
}