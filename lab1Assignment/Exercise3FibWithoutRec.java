 class Exercise3FibWithoutRec
{
static void withoutRec(int count)
{
int a=1,b=1,c=0;
for(int i=2;i<count;i++)
{
c=a+b;
a=b;
b=c;
}
System.out.print(" "+c);
}
public static void main(String[] args)
{
withoutRec(10);
}
}
