// https://codeforces.com/problemset/problem/231/A

import java.util.*;
 
public class Team {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            int sum = 0;
            int count = 0;
            while(t-- > 0) {
                int arr1[] = new int[3];
                for(int i = 0; i < 3; i++) {
                    int x = input.nextInt();
                    arr1[i] = x;
                }
                sum = arr1[0] + arr1[1] + arr1[2];
                if(sum >= 2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
