import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        double max = 0;
        int counter = 0;
        double incomeLessThanTenPercentOfMax = 0;
        System.out.println("Enter the size of an array");
        int size = keyboard.nextInt();
        double[] familiesIncome = new double[size];
        System.out.println("We will find max in: " + size + " array entries");
        for(int i = 0; i<familiesIncome.length; i++)
        {
            System.out.println("Enter income for family: " +(i+1));
            familiesIncome[i] = keyboard.nextDouble();

        }
        for(int i = 0; i<familiesIncome.length; i++)
        {
            if(familiesIncome[i] > max)
                max = familiesIncome[i];
        }
        System.out.println("Max among: " + size +" enteries is: " + max);
        incomeLessThanTenPercentOfMax = (Math.round(0.1*max));
        System.out.println("Amount less than 10%: " +  incomeLessThanTenPercentOfMax);
        for(int i = 0; i<familiesIncome.length; i++)
        {
            if(familiesIncome[i] < incomeLessThanTenPercentOfMax)
            {
                familiesIncome[counter] = familiesIncome[i];
                counter++;
            }

        }

        System.out.println("The number of families are: " + counter);
        System.out.println("Their income is: ");
        for(int i = 0; i<counter; i++)
        {
            System.out.println(familiesIncome[i]);

        }





    }
}
