// https://codeforces.com/problemset/problem/318/A

import java.util.*;

public class Even_Odds {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long n = input.nextLong();
            long p = input.nextLong();
            long x = (n + 1) / 2;
            System.out.println( p<=x ? 2 * p - 1 : 2 * (p - x));

        }
    }
}