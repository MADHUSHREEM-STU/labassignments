import java.util.*;
class StringDigits2
{
static String isDigit(String name)
{
int i=0;
char[] ch=name.toCharArray();
for( i=0;i<ch.length;i++)
{
if(ch[i]>='1'&&ch[i]<='9'&&ch.length==1)
{
return ""+ch[i];
}
else if(ch[i]>='1'&&ch[i]<='9'&&ch.length==2)
{
int a=Character.getNumericValue(ch[0]); 
int b=Character.getNumericValue(ch[1]); 
return ""+(a+b);
}
}
return "Wrong digit";
}
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter num");
String name=scan.nextLine();
String c=isDigit(name);
System.out.println(c);
}
}
	     