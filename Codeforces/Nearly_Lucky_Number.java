// https://codeforces.com/problemset/problem/110/A

import java.util.*;

public class Nearly_Lucky_Number {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String num = input.next();
            int count = 0;
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '4' || num.charAt(i) == '7')
                    count++;  
            }
            if (count == 4 || count == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}