//  https://codeforces.com/contest/230/problem/B

import java.lang.reflect.Array;
import java.util.*;

public class T_primes { 
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            int max = 1000000;
            boolean[] b = new boolean[(max + 1)];
            b[0]= b[1]= false;
            Arrays.fill(b, true);
            for (int p = 2; p * p <= max; p++) {
                        if (b[p]) {
                            for (int i = p * p; i <= max; i += p)
                                b[i] = false;
                        }
                    }
            while(t-- > 0){
                long n=input.nextLong();
                long sr = (long)Math.sqrt(n);
                if (n<=2) {
                    System.out.println("NO");
                    continue;
                }
                else{
                    if(sr*sr == n && b[(int)sr])
                        System.out.println("YES");
                    else 
                        System.out.println("NO");   
                }
            }
        }
    }
}