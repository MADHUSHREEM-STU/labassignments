package capgeminipractice;

import java.util.*;

public class Exercise7 {

	static int[] getSorted(int[] array)
	{
		ArrayList<Integer> t = new ArrayList<Integer>();
		for(int i=0;i<array.length-1;i++)
		{
			t.add(array[i]);
		}
		Collections.reverse(t);
		Collections.sort(t);
		Iterator<Integer> i=t.iterator();
		int k=0;
		while(i.hasNext());
		{
			array[k++]=i.next();
		}
		return array;
		
	}
	public static void main(String[] args)
	{
		int[] array={ 20,10,30,60,50};
// 		Arrays.toString(array);
 		int[] arr=getSorted(array);
 		for(int i:arr)
 		{
		System.out.println(i);
 		}
		
	}
}
