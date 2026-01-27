//  https://codeforces.com/problemset/problem/546/A

import java.lang.reflect.Array;
import java.util.*;

public class Soldier_and_Bananas {  
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int k = input.nextInt();
            int n = input.nextInt();
            int w = input.nextInt();
            int b = 0;
            for (int i = 1; i <= w; i++) {
                b=b+(k*i);
            }

            if (b > n) {
                System.out.println(b-n);
            } else {
                System.out.println(0);
            }
        }
    }
}