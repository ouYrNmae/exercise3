// Jocelin Martinez-Reyes
// Exercise 3 1/30/25

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quit = 0;
        while (quit == 0) {
            int tempF = userTemp();
            int tempC = FToC(tempF);
            if (tempF < -460) {
                quit = 1;
            } else {
                display(tempF, tempC);
            }
        }
        System.out.println("Thank you, good-bye.");
    }
    static int userTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a temperature");
        System.out.println("Note: To end the program enter a number less than -460.");
        return input.nextInt();
    }
    static int FToC (int tempF){
        int tempC = (tempF-32)*5/9;
        return tempC;
    }
    static void display (int tempF, int tempC){
        System.out.println("The temperature that you inputted in for Fahrenheit is " + tempF + " calculating that to Celsius will be " + tempC + ".");
    }
}
