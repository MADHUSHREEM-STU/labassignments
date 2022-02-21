class Exercise7{
static boolean checkNumber(int n)
{
while (n > 0) {
    int d1 = n % 10;
    n = n/10;
    int d2 = n % 10;

    if (d2 > d1) 
        return false;    
}
return true;
}
public static void main(String[] args)
{
System.out.println(checkNumber(2589));
}
}