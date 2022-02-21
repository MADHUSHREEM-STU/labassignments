import java.util.*;
class StringTest
{
static String concatAdd(String s1,String s2)
{
String s3=s1+s2;
String s4=s1.replaceAll(" ","")+s2.replaceAll(" ","");
return s4;
}

static String reverse(String s1)
{
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
return s2;
}


protected static int paddingIndex(String s1,String s2)
{
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s2.length();j++)
{
if(s1.charAt(i)==s2.charAt(j))
return i;
}
}
return 0;
}


static boolean isDigit(String s1)
{
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch>='0' && ch<='9')
continue;
else
return false;	
}
return true; 	
} 

public static void main(String[] args)
{
System.out.println(concatAdd("i love india","it is my country"));
System.out.println(reverse("madhu"));
System.out.println(paddingIndex("hindusthan","dust"));
System.out.println(isDigit("123"));
}
}