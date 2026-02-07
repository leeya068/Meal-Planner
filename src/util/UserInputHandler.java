package util;

import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;

    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getHourFromUser() {
        int hour = -1;
        while (hour < 0 || hour > 23) {
            System.out.print("Enter hour (0-23): ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
            } else {
                scanner.next(); // clear invalid input
            }
        }
        return hour;
    }

    public boolean askAbbreviation() {
        System.out.print("Do you want abbreviation? (y/n): ");
        String input = scanner.next();
        return input.equalsIgnoreCase("y");
    }
}
