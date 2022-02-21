class Exercise4{
static void isprime(int n)
{
int count=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
count++;
if(count>0)
break;
}
if(count==0)
System.out.println(n);
}
public static void main(String[] args)
{
int n=10;
for(int i=2;i<=n;i++)
{
isprime(i);
}
}
}