package com.lexxkit;

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

        //Alternative approach
        fullName = fullName.toLowerCase();
        String[] fullNameArray = fullName.split(" ");
        String fullNameCapitalized = "";

        for (String word : fullNameArray) {
            fullNameCapitalized = fullNameCapitalized + (word.substring(0, 1).toUpperCase() + word.substring(1)) + " ";
         }
        System.out.println("Proper employee's name is " + fullNameCapitalized.trim());

        System.out.println("\nTask 7. Two strings into one.");
        String firstStr = "135";
        String secondStr = "246";

        StringBuilder sb = new StringBuilder(secondStr);

        for (int i = 0; i < firstStr.length(); i++) {
            sb.insert(i*2, firstStr.toCharArray()[i]);
        }
        System.out.println(sb);

        System.out.println("\nTask 8. Print duplicated letters.");
        String initialStr = "aabccddefgghiijjkk";

        char[] initialChars = initialStr.toCharArray();
        StringBuilder resultStr = new StringBuilder();

        for (int i = 1; i < initialChars.length; i++) {
            if (initialChars[i - 1] == initialChars[i]) {
                resultStr.append(initialChars[i]);
            }
        }
        if (resultStr.length() == 0) {
            System.out.println("There are no duplicate letters in " + initialStr);
        } else {
            System.out.println(resultStr);
        }
    }
}
