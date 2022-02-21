package lamdaassignments;

public class lab9exp1 
{
	exp1 power=(x,y)->{
		return (int) Math.pow(x, y);
		};
		public static void main(String[] args) {
			exp1 of=(x,y)->{
				return (int) Math.pow(x, y);
				};	
				System.out.println(of.power(3, 2));
		}

}
