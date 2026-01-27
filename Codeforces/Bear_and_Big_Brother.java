//  https://codeforces.com/problemset/problem/791/A

import java.util.*;

public class Bear_and_Big_Brother { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int y = input.nextInt();
            int count = 0;
            while (x <= y) {
                x = x * 3;
                y = y * 2;
                count++;
            }
            System.out.println(count);
        }
    }
}