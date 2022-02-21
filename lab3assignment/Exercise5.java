import java.util.*;
import java.io.*;
class Exercise5{
static String path="E:/LabAssignments/lab3assignment/sometext.txt";
public static void main(String[] args)
{
int charcount=0;
int wordcount=0;
int linecount=0;
BufferedReader reader;
try{
reader=new BufferedReader(new FileReader(path));
String currentLine=reader.readLine();
while(currentLine!=null)
{
linecount++;
String words[]=currentLine.split(" ");
wordcount=wordcount+words.length;

for(String word:words){
charcount=charcount+word.length();
}
currentLine=reader.readLine();
}
System.out.println("lines: "+linecount);
System.out.println("words: "+wordcount);
System.out.println("char: "+charcount);
}
catch(FileNotFoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
}
}