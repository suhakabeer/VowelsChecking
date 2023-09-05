package com.canddella.utility;

import java.util.Scanner;

public class VovelsChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Word");
        String word = scanner.nextLine();
        boolean containsVowel = containsVowel(word);
        if (containsVowel)
        {
        	System.out.println("The Word contains vowel");
        }
        else 
        {
        	System.out.println("The Word does not contains vowel");
        }
    }

	private static boolean containsVowel(String word) {
		
		return word.toLowerCase().matches(".*[aeiou].*");
	}
}
