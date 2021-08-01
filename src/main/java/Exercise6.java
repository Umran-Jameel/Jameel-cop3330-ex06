
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */
import java.util.*;

public class Exercise6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String cur_age = in.nextLine();
        System.out.print("At what age would you like to retire? ");
        String ret_age = in.nextLine();

        int age = Integer.parseInt(cur_age);
        int retire = Integer.parseInt(ret_age);

        // challenge negative number, state user can already retire
        if (retire - age < 0) {
            System.out.println("You can retire right now!");
            System.exit(0);
        }

        System.out.printf("You have %d years until you can retire.", retire - age);

        Date date = new Date();
        int year = date.getYear() + 1900;
        System.out.printf(" It's %d, so you can retire in %d.", year, year + (retire - age));
    }
}
