class Exercise6
{

static int calculateDifference(int n)
{
int sum=0, sum1=0,sum2=0;
for(int i=1;i<=n;i++)
{
sum1=sum1+(i*i);
sum2=(sum2+i);
}
sum2=sum2*sum2;
sum=sum1-sum2;
return sum;
}
public static void main(String[] args)
{
System.out.println(calculateDifference(3));
}
}


