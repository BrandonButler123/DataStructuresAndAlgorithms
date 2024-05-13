import java.util.Arrays;
import java.util.Scanner;

public class TemperatureAssignment {

    public static void main(String[] args) {
        // Initialize scanner
        Scanner userInput = new Scanner(System.in);

        // Determine number of temperatures desired by user & initialize array equal to this number
        System.out.println("How many temperatures would you like to enter?");
        int numOfTemps = userInput.nextInt();
        float array[] = new float[numOfTemps];

        System.out.println("Enter the temperatures below: ");

        // loop user inputs into an array
        for (int i=0; i < array.length; i++) {
            array[i] = userInput.nextFloat();
        }

        System.out.println("You entered the following temperatures: ");

        // loop user inputs to determine temperature average
        float sum = 0;
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum + array[i];
        }

        float tempAvg = sum/array.length;
        System.out.println("The average temperature equals: " + tempAvg);

        // Determine if any user input temps are above temp avg
        System.out.println("The following temperatures are above the average: ");
        for (int i=0; i < array.length; i++)
            if (tempAvg < array[i]) {
                System.out.println(array[i]);
            }

        // Closing scanner
        userInput.close();
    }
}
