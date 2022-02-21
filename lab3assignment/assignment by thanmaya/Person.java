import java.util.Random;
class Account
{
private long accNum;
private double balance;
private Person accHolder;
void deposit(double amount)
{
balance=balance+amount;
}
void withdraw(double amount) { 
balance = balance - amount;
}

void setAccNum(int accNum)
{
this.accNum = accNum;
}
void setBalance(double balance)
{
this.balance = balance;
}
void setAccHolder(Person accHolder)
{
this.accHolder = accHolder;
}


long getaccNum()
{
return accNum;
}

double getabalance()
{
return balance;
}

Person getaccHolder()
{
return accHolder;
}



class Person
{
private String name;
private float age;
void setName(String name)
{
this.name=name;
}
void setAge(float age)
{
this.age=age;
}
String getName()
{
return name;
}
float getAge()
{
return age;
}
}



class SavingsAccount extends Account
{
final int minbalance = 500;
void withdraw(double amount)
{
if(getBalance() >= minbalance+amount){
double bal = getBalance()-amount;
setBalance(bal);
System.out.println("Balance:"+bal);
}
else
System.out.println("Minimum balance not there");
}
}
}



class CurrentAccount extends Account
{
int limit = 500;
void withdraw(double amount)
{
if(getBalance() >=limit+amount)
{
double bal2= getBalance()-amount;
setBalance(bal2);
System.out.println("Balance :"+bal2);
}
else
{ 
System.out.println("Minimum balance not there");  
}
}
}



class Bank
{
public static void main(String[] args)
{
Random r1 = new Random();
SavingsAccount SA = new SavingsAccount();
Person p1 = new Person();
SA.setAccNum(r1.nextInt(10000));
p1.setAge(23);
p1.setName("smitha");
SA.setBalance(2000);
SA.deposit(2000);
double balance1= SA.getBalance();
System.out.println(balance1);

CurrentAccount CA = new CurrentAccount();
Person p2 = new Person();
CA.setAccNum(r1.nextInt(10000));
p2.setAge(24);
p2.setName("Kathy");
CA.setBalance(3000);
CA.withdraw(2000);
double balance2= CA.getBalance();
System.out.println(balance2);
}
}
