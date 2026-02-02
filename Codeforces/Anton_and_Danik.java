// https://codeforces.com/problemset/problem/734/A

import java.util.*;

public class Anton_and_Danik { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n= input.nextInt();
            String s = input.next();
            int a = 0;
            int d = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                } else {
                    d++;
                }
            }
            if (a > d) {
                System.out.println("Anton");
            } else if (d > a) {
                System.out.println("Danik");
            } else {
                System.out.println("Friendship");
            }
        }
    }
}