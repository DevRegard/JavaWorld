package toy.of;

import java.time.Period;

public class PeriodOf
{
    public static void main(String[] args)
    {

        // Get the number of Years
        int numberOfYears = 2022;

        // Get the number of Months
        int numberOfMonths = 4;

        // Get the number of Days
        int numberOfDays = 16;

        // Parse the given amounts into Period
        // using of() method
        Period p = Period.of(numberOfYears, numberOfMonths, numberOfDays);

        System.out.println(p.getYears() + ". " + p.getMonths() + "/" + p.getDays());
    }
}
