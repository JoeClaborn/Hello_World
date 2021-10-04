// Joe Claborn
package Java.ClassWorkProblems;

import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {

        // better style for data support
        final int UNIT_CONV_FAC = 703;

        System.out.println("Hello World!");
        System.out.println("My Name is Bob.");
        System.out.print("What is Your Name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");

        // weight (lb) / height (in)]2 x 703
        System.out.print("What is your height in inches? ");
        int height = input.nextInt();
        
        System.out.print("What is your weight in pounds? ");
        int weight = input.nextInt();

        // typecasting to avoid integer division
        double bmi = ((double) weight) / Math.pow(height, 2) * UNIT_CONV_FAC;
        
        // camel case for "roundedBMI"
        // divided by "10.0" instead of "10" to avoid integer division
        double roundedBmi = Math.round(bmi * 10) / 10.0;
        System.out.println("Your BMI is " + roundedBmi);
        input.close();
    }
}