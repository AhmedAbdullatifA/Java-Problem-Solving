// https://codeforces.com/problemset/problem/318/A

import java.util.*;

public class Drinks {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int u = n;
            float sum = 0;
            while(u-- > 0){
                sum+= input.nextInt();
            }
            System.out.println(sum/n);
        }
    }
}