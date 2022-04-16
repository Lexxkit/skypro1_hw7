package com.lexxkit;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1. Print full name.\n");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Person's full name is - " + fullName);

        System.out.println("\nTask 2. Upper case.");

        fullName = fullName.toUpperCase();
        System.out.println("Person's full name for the report - " + fullName);

        System.out.println("\nTask 3. Replace the symbol");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Person's full name is - " + fullName);

        System.out.println("\nTask 5. Split full name.");
        fullName = "Ivanov Ivan Ivanovich";
        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");
        lastName = fullName.substring(0, firstSpace);
        firstName = fullName.substring(firstSpace + 1, lastSpace);
        middleName = fullName.substring(lastSpace + 1);
        System.out.println("Employee's name is " + firstName);
        System.out.println("Employee's surname is " + lastName);
        System.out.println("Employee's middle name is " + middleName);

        System.out.println("\nTask 6. Capitalize first letters.");
        fullName = fullName.toLowerCase();
        System.out.println("Wrong employee's name is + " + fullName);

        char[] chars = fullName.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        chars[firstSpace + 1] = Character.toUpperCase(chars[firstSpace + 1]);
        chars[lastSpace + 1] = Character.toUpperCase(chars[lastSpace + 1]);
        fullName = String.valueOf(chars);
        System.out.println("Proper employee's name is " + fullName);

    }
}
