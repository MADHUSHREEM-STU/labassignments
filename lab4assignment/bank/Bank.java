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


long getAccNum()
{
return accNum;
}

double getBalance()
{
return balance;
}

Person getaccHolder()
{
return accHolder;
}

}

class Person
{
private String name;
private double age;
void setName(String name)
{
this.name=name;
}
void setAge(double age)
{
this.age=age;
}
String getName()
{
return name;
}
double getAge()
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
{
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
System.out.println(true);
}
else
{ 
System.out.println(false);  
}
}
}



class Bank
{
public static void main(String[] args)
{
Random random= new Random();
SavingsAccount SA = new SavingsAccount();
Person p1 = new Person();
SA.setAccNum(random.nextInt(1234));
p1.setName("smitha");
p1.setAge(25);
SA.setBalance(2000);
SA.deposit(2000);
System.out.println("balance: "+SA.getBalance());

CurrentAccount CA = new CurrentAccount();
Person p2 = new Person();
CA.setAccNum(random.nextInt(2345));
p2.setName("Kathy");
p2.setAge(30);
CA.setBalance(3000);
CA.withdraw(2000);
System.out.println("balance: "+CA.getBalance());
}
}
