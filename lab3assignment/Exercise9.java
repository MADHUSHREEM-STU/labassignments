import java.time.*;
import java.util.*;
class Exercise9 {
static void findDuration(LocalDate start_date,LocalDate current_date)
{
Period diff= Period.between(start_date,current_date);
System.out.print("Difference " + "between two dates is: ");
System.out.printf( "%d years, %d months"+ " and %d days ",diff.getYears(),diff.getMonths(),diff.getDays());
}
public static void main(String[] args)
{
LocalDate start_date= LocalDate.of(1997, 02, 15);
LocalDate current_date= LocalDate.of(2016, 03, 22);
findDuration(start_date,current_date);
}
}