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

    }
}
