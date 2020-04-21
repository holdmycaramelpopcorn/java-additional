package p9b;
import java.util.Scanner;
import java.util.regex.*;
// Java program to check if String contains only Alphabets
// using Regular Expression

class Main {

    // Function to check String for only Alphabets
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    // Main method
    public static void main(String[] args)
    {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Input: " + str1);
        System.out.println("Has Only Alphabet? " + isStringOnlyAlphabet(str1));
    }
}

