class Display2
{
public static void main(String[] args)
{
String s1="My company name is capgemini";
char words[]=s1.toCharArray();
for(int i=0;i<words.length;i++)
{
words[i]=Character.toLowerCase(words[i]);
s1=String.valueOf(words);
}
String s2[]=s1.split(" ");
for(int i=0;i<s2.length;i++)
{
if( (s2[i].charAt(0)=='c' && s2[i].charAt(2)=='m')||(s2[i].charAt(0)=='c'&& s2[i].charAt(2)=='p'))
{
System.out.println(s2[i]);
}
}
}
}