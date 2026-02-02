// https://codeforces.com/problemset/problem/41/A

import java.util.*;

public class Translation { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s1 = input.next();
            String s2 = input.next();
            if(s1.length() != s2.length()) 
                System.out.println("NO");
            else{
            for(int i=0, j=s2.length()-1; i<s1.length(); i++, j--) {
                if(s1.charAt(i) != s2.charAt(j)) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
        }
    }
}