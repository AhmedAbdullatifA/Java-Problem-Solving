// https://codeforces.com/contest/26/problem/A

import java.util.*;
 
public class Almost_Prime {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int arr[] = new int[n];
            int s = 0;
            int count = 0;
            int num = 0;
            if (n>=2) {
                arr[0] = 2;
                s=1;
            }
            for(int i=3; i<=n; i++) {
                int is_prime = 0;
                for(int j=2; j<=Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        is_prime++;
                        break;
                    }
                }
                if(is_prime == 0) {
                    arr[s] = i;
                    s++;
                }
            }
            for(int i=4; i<=n; i++) {
                count = 0;
                for(int j=0; j<s; j++) {
                    if(i%arr[j] == 0) 
                        count++;
                }
                if(count == 2) 
                    num++; 
    }
    System.out.println(num);
}
    }
}