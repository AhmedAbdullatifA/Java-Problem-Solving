// https://codeforces.com/contest/1/problem/A

import java.util.*;
 
public class Theatre_Square {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int m = input.nextInt();
            int a = input.nextInt();
            System.out.println((long)((n+a-1)/a)*((m+a-1)/a));
            }
    }
}