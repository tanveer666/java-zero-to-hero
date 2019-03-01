package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        int current_year = 2019;
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);
        int insertedInt = sc.nextInt(); //or sc.nextLine() for String
        System.out.println("You are: " + insertedInt + " years old");
        int birth_year = 2019- insertedInt;
        System.out.println("youre birth year is "+ birth_year);

        if(insertedInt > 18)
        {
            System.out.println("Have you coded on java yet?");
            String answer = sc.next();


            answer = answer.toLowerCase();
            System.out.println("You answered " + answer);

            if(answer.equals("no") )
            {
                System.out.println("Very SAD!");
            }
            else if(answer.equals("yes") )
            {
                System.out.println("And that's a GOOD thing!");
            }

        }


        // todo calculate and print which year person was born in
        // todo if person is 18+ ask them whether they have coded java
        // todo if yes, do sth, if no, do sth else
    }
}
