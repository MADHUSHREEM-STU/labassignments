import java.util.*;
class Exercise4
{
public static int removeduplicates(int a[], int n)
{
Arrays.sort(a);  
int[] temp = new int[n];
int i = 0, j = 0;
temp[j++] = a[i++];
for (; i < n - 1; i++) {
if (a[i] != a[i-1]) {
temp[j++] = a[i];
}
}
for (i = 0; i < j; i++) {
a[i] = temp[i];
}
return j;
}
public static void main(String[] args)
{
int a[] = {1, 1, 5, 6, 2, 2, 9, 9 };
int n = a.length;
n = removeduplicates(a, n);
for (int i =n-1; i >=0; i--)
System.out.print(a[i] + " ");
}
}