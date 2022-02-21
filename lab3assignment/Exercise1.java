import java.util.*;


class Exercise1{


public static void main(String args[])

{


Scanner scan = new Scanner(System.in);


System.out.print("Enter line of integers with comma: ");


String str = scan.next();


StringTokenizer s = new StringTokenizer(str,",");


int sum = 0;


while(s.hasMoreTokens())


{
int 
n = Integer.parseInt(s.nextToken());


System.out.println(n);


sum = sum+n;


}


System.out.println("sum of the numbers : "+sum);
}
}