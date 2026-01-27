//  https://codeforces.com/problemset/problem/281/A

import java.util.*;

public class Word_Capitalization {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s = input.nextLine();
            System.out.println(Character.toUpperCase(s.charAt(0)) + 
            s.substring(1));
        }
    }
}