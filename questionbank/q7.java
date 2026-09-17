package questionbank;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        // String[] arr = st.trim().split("\\s+");
        // char[] array = new char[10000];
        // int j = 0;

        // for (String a : arr) {
        //     for (int i = 0; i < a.length(); i++) {
        //         array[j++] = a.charAt(i);
        //     }
        // }

        // boolean isPalindrome = true;
        // int left = 0;
        // int right = j - 1; // Set right pointer to the last inserted character index

        // while (left < right) {
        //     if (array[left] != array[right]) {
        //         isPalindrome = false;
        //         break;
        //     }
        //     left++;  // Move left pointer rightward
        //     right--; // Move right pointer leftward
        // }

        // if (isPalindrome) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }
        
        Scanner sc = new Scanner(System.in);
        
        // Remove all whitespace characters
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}