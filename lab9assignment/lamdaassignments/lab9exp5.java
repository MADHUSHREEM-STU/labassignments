package lamdaassignments;
 
public class lab9exp5 {  
	static exp5 fact;

	public static void main(String[] args) {
		
		fact = (x) -> {
			if (x != 0)
				return x * (fact.factorial(x - 1));
			else {
				return 1;
			}
		};
		int i = fact.factorial(4);
		System.out.println(i);
	} 
}
	
