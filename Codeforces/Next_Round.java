// https://codeforces.com/contest/158/problem/A

import java.util.*;

public class Next_Round { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int target = input.nextInt();
            int count = 0;
            int scores[] = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (scores[i] >= scores[target - 1] && scores[i] > 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}