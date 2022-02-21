import java.util.*;
class Exercise8{
static boolean ispositive(String str)
{
int n=str.length();
char ch[] = new char [n];
for (int i = 0; i <n; i++) {
ch[i] = str.charAt(i);
}
Arrays.sort(ch);
for (int i = 0; i < n; i++)
if (ch[i] != str.charAt(i)) 
return false;
return true;    
}
public static void main(String args[])
{
String str = "ANT";
if (ispositive(str))
System.out.println("Positive");
else
System.out.println("Negative");      
}
}