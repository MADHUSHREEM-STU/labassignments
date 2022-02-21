class Exercise1{
static int cubeOfDigit(int n){
int sum=0;
while(n!=0)
{
int i=n%10;
sum=sum+i*i*i;
n=n/10;
}
return sum;
}
public static void main(String[] args){
System.out.println(cubeOfDigit(123));
}
}
