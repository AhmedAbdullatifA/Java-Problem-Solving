// https://codeforces.com/problemset/problem/271/A

import java.util.*;

public class Beautiful_Year { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();n++;
            String s = String.valueOf(n);
            while(!((s.charAt(0)!=s.charAt(1)&&s.charAt(0)!=s.charAt(2)
                &&s.charAt(0)!=s.charAt(3)) && (s.charAt(1)!=s.charAt(2)
                &&s.charAt(1)!=s.charAt(3)) && (s.charAt(2)!=s.charAt(3)))){
                    n++;
                    s=String.valueOf(n);
            }
            System.out.println(n);
        }
    }
}