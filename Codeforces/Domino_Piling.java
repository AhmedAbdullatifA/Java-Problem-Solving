// https://codeforces.com/problemset/problem/50/A

import java.util.*;

public class Domino_Piling {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int m = input.nextInt();
            int n = input.nextInt();
            System.out.println((m*n)/2);
        }
    }
}