package com.example;
import java.util.Arrays;
//import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Anagram_checker{
	
	public static void main(String[] args) {
		
		// using sorting of string
//		Scanner str1 = new Scanner(System.in);
//		
//		
//		System.out.println("Enter str1: ");
//		String string1 = str1.nextLine(); 
//		
//		System.out.println("Enter str2: ");
//		String string2 = str1.nextLine();
//		
//		int n1 = string1.length();
//		int n2 = string2.length();
//		
//		if(n1 != n2) {
//			System.out.println("Strings are not Anagrams");
//			return;
//		}
//		
//			
//		char[] char1 = string1.toCharArray();
//		char[] char2 = string2.toCharArray();
//		
//		Arrays.sort(char1);
//		Arrays.sort(char2);
//			
//		if(Arrays.equals(char1, char2)) {
//			System.out.println("Both are Anagrams");
//		}else {
//			System.out.println("Not an Anagrams");
//		}
//			
//		str1.close();
		
		
		// Met2: using frequency array
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter str1: ");
		String str1 = input.nextLine();
		
		System.out.println("enter str2: ");
		String str2 = input.nextLine();
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1 != n2) System.out.println("Not Anagrams");
		
		int[] freq = new int[26];
		
		for(int i=0; i<n1; i++) {
			freq[str1.charAt(i)-'a']++;
			freq[str2.charAt(i)-'a']--;
		}
		
		for(int i: freq) {
			if(i != 0) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Both are Anagrams");
		input.close();
		
		
		
	}
}


//optimize
//package com.example;
//
//import java.util.Scanner;
//
//public class AnagramChecker {
//
//    public static boolean isAnagram(String s1, String s2) {
//
//        if (s1 == null || s2 == null) return false;
//
//        s1 = s1.replaceAll("\\s", "").toLowerCase();
//        s2 = s2.replaceAll("\\s", "").toLowerCase();
//
//        if (s1.length() != s2.length()) return false;
//
//        int[] freq = new int[26];
//
//        for (int i = 0; i < s1.length(); i++) {
//            freq[s1.charAt(i) - 'a']++;
//            freq[s2.charAt(i) - 'a']--;
//        }
//
//        for (int count : freq) {
//            if (count != 0) return false; // early exit
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter str1: ");
//        String str1 = sc.nextLine();
//
//        System.out.print("Enter str2: ");
//        String str2 = sc.nextLine();
//
//        System.out.println(
//            isAnagram(str1, str2) ? "Anagrams" : "Not Anagrams"
//        );
//
//        sc.close();
//    }
//}


// Met 4: Case Sensetive
//package com.example;
//
//import java.util.Scanner;
//
//public class AnagramChecker {
//
//    public static boolean isAnagramCaseSensitive(String s1, String s2) {
//
//        if (s1 == null || s2 == null) return false;
//
//        // Length check (NO case conversion)
//        if (s1.length() != s2.length()) return false;
//
//        // ASCII frequency array (0–255)
//        int[] freq = new int[256];
//
//        for (int i = 0; i < s1.length(); i++) {
//            freq[s1.charAt(i)]++;
//            freq[s2.charAt(i)]--;
//        }
//
//        // Check frequency balance
//        for (int count : freq) {
//            if (count != 0) return false;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter str1: ");
//        String str1 = sc.nextLine();
//
//        System.out.print("Enter str2: ");
//        String str2 = sc.nextLine();
//
//        System.out.println(
//            isAnagramCaseSensitive(str1, str2)
//                ? "Anagrams (Case-Sensitive)"
//                : "Not Anagrams"
//        );
//
//        sc.close();
//    }
//}
//
//
//
