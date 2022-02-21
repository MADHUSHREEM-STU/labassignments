class Exercise3FibwithRec{
static int a=1,b=1,c=0;
static void withRec(int count)
{

if(count>0)
{
c=a+b;
a=b;
b=c;
withRec(count-1);
}

}
public static void main(String[] args)
{
int count=10;
withRec(count-2);
System.out.println(" "+c);
}
}


