import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Variables
        double fahrenheit;
        int celsius = 0;
        String wrongInput = "";


        System.out.println("Enter degrees in Celsius ");
        if(in.hasNextInt())
        {
            celsius = in.nextInt();
        }
        else
        {
            //not a degree in numbers
            wrongInput = in.nextLine();
            System.out.println("you said the temperatrue was " + wrongInput);
            System.out.println("Run the program again and enter degrees in numbers");
            System.exit(0);//Terminates the program
        }

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("The degrees in Fahrenheit is " + fahrenheit);
    }
}