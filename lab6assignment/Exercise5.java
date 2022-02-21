package capgeminipractice;

import java.util.*;

public class Exercise5 {
	public static  int getSeconfdSmallest(int array[])
	{
		ArrayList<Integer> t = new ArrayList<Integer>();
		 for (int i = 0; i < array.length; i++){
	            t.add(new Integer(array[i]));
	    }
		 Collections.sort(t);
		 int secondsmall=t.get(2);
		return secondsmall;
	}
	
	
	
public static void main(String[] args){
	int array[] = { 20,10,30,60,50};
    System.out.println(getSeconfdSmallest(array));
}
}
