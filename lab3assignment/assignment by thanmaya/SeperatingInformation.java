class Person
{
private String loc;
private String name;
private double salary;
public Person(String loc,String name,double salary)
{
this.loc=loc;
this.name=name;
this.salary=salary;		
}
public void setLoc(String loc)
{
this.loc=loc;	
}
public void setName(String name)
{
this.name=name;
}
public void setSalary(double salary)
{
this.salary=salary;	
}
public String getLoc()
{
return loc;	
}
public String getName()
{
return name;
}
public double getSalary()
{
return salary;	
}
}
public class SeperatingInformation
{ 

static Person seperateLocNameSal(String locNameSal)
{
String loc="",name="";
double sal=0;
int length=locNameSal.length();

int i=0;
while(i<length)
{
if(!(locNameSal.charAt(i)=='N' && locNameSal.charAt(i+1)=='M'))
{
loc=loc+String.valueOf(locNameSal.charAt(i));	
}
else
{
i=i+2;
break;
}
i++;
}


while(i<length)
{
if(!(locNameSal.charAt(i)=='S' && locNameSal.charAt(i+1)=='A'&& locNameSal.charAt(i+2)=='L'))
{
name=name+String.valueOf(locNameSal.charAt(i));
}
else
{
i=i+3;
break;	
}
i++;	
}

String temp="";

while(i<length)
{
temp=temp+String.valueOf(locNameSal.charAt(i));	
i++;
}
sal=Double.parseDouble(temp)*1000;
Person p1=new Person(loc,name,sal);
return p1;

}


static String gradeOfPerson(Person person)
{
String grade="";
double sal=person.getSalary();
if(sal>25000)
grade="A";
else if(sal>=10000 && sal<=25000)
grade="B";
else
grade="C";
return grade;	
}
public static void main(String[] args)
{
String str="HydNMKiran-KumarSAL25";
Person p=seperateLocNameSal(str);
System.out.println("employee location: "+p.getLoc());
System.out.println("employee name: "+p.getName());
System.out.println("employee salary: "+p.getSalary());
System.out.println("grade: "+gradeOfPerson(p));
}
}