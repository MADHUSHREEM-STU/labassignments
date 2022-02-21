import java.util.TreeSet;


class Exercise2
{
    
static String[] sortStrings(TreeSet<String> arr) 
{
        
int n = arr.size();
        
String[] arr1 = new String[n];
        
arr1 = arr.toArray(arr1);
        
if (n % 2 == 0) 
{
            
for (int i = 0; i < n / 2; ++i) 
{
                
arr1[i] = arr1[i].toUpperCase();
            
}
            
for (int i = n / 2; i < n; ++i) 
{
                
arr1[i] = arr1[i].toLowerCase();
            
}

 }
        
else 
{
            
for (int i = 0; i < n / 2 + 1; ++i) 
{
                
arr1[i] = arr1[i].toUpperCase();
            
}
            
for (int i = n / 2 + 1; i < n; ++i) 
{
                
arr1[i] = arr1[i].toLowerCase();
            
}
        
}
        
return arr1;
    
}
    
    
public static void main(String[] args)
{
        
TreeSet<String> str = new TreeSet<String>();
        
str.add("Hello");
        
str.add("How");

str.add("are");
 
str.add("you");
              
str.add("Doing");
               
String[] result = sortStrings(str);
        
int length =  result.length;       
for (int j = 0; j < length; ++j) 
{
            
String i = result[j];
            
System.out.print(String.valueOf(i) + "  ");
        
}
    
}
}