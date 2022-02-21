class Exercise2{
static String getImage(String s)
{
StringBuffer s1= new StringBuffer(s);
s1.append('|');
StringBuffer s2=new StringBuffer(s);
s2.reverse();
s1.append(s2);
return s1.toString();
}
public static void main(String[] args)
{
System.out.println(getImage("EARTH"));
}
}
