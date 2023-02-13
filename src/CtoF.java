import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Variables
        double fahrenheit;
        int celsius = 0;
        String wrongInput = "";


        //prompt for input
        System.out.println("Enter degrees in Celsius ");
        //input if is number if not go to else
        if(in.hasNextInt())
        {
            celsius = in.nextInt();
        }
        //for any incorrect input
        else
        {
            //not a degree in numbers
            wrongInput = in.nextLine();
            System.out.println("you said the temperature was " + wrongInput);
            System.out.println("Run the program again and enter degrees in numbers");
            System.exit(0);//Terminates the program
        }

        //does the calculations for Fahrenheit if the input is correct
        fahrenheit = (celsius * 1.8) + 32;

        //an if statement to tell the user the temp is at boiling temps
        if(fahrenheit >= 212)
        {
            System.out.printf("The temperature is above the boiling point %.2f", + fahrenheit);
        }
        //an if statement to tell the user the temp is at freezing temps
        else if (fahrenheit <=32)
        {
            System.out.printf("The temperature is below the freezing point %.2f", + fahrenheit);
        }
        //if not freezing or boiling just states temps
        else
        System.out.printf("The degrees in Fahrenheit is %.2f", + fahrenheit);
    }
}