class Exercise3
{
static String alterString (char[] s)
{
for (int i = 0; i < s.length; i++)
{
if (!isVowel(s[i]))
{
if (s[i] == 'Z')
{
s[i] = 'B';
}
else
{
s[i] = (char) (s[i] + 1);
 }
}
}
return String.valueOf(s);
}
static boolean isVowel(char ch)
{
if (ch != 'A' && ch != 'E' && ch != 'I'&& ch != 'O' && ch != 'U')
{
return false;
}
return true;
}
public static void main(String[] args)
{
String s = "JAVA";
char[] cha=s.toCharArray();
System.out.println(alterString (cha));
}
}
 