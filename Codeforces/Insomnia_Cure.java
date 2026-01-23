// https://codeforces.com/contest/148/problem/A

import java.util.*;

public class Insomnia_Cure {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int k = input.nextInt();
            int l = input.nextInt();
            int m = input.nextInt();
            int d = input.nextInt();
            int count = 0;
            for (int i = 1; i <= d; i++) {
                if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}