// https://codeforces.com/problemset/problem/96/A

import java.util.*;

public class Football {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String num = input.next();
            int count = 0;
            for (int i = 0; i < num.length() - 1; i++) {
                if (num.charAt(i) == num.charAt(i + 1)) {
                    count++;
                    if (count == 6) {
                        System.out.println("YES");
                        return;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println("NO");
        }
    }
}