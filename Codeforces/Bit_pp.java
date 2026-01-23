// https://codeforces.com/problemset/problem/282/A

import java.util.*;

public class Bit_pp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int result = 0;
            while(n-- > 0) {
                String s = input.next();
                if(s.charAt(1) == '+') {
                    result++;
                } else {
                    result--;
                }
            }
            System.out.println(result);
        }
    }
}