// https://codeforces.com/problemset/problem/2191/B

import java.util.Scanner;
 
public class MEX_Reordering {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            
            while(t-- > 0) { 
                int n = input.nextInt();
                
                int count0 = 0, count1 = 0;
                
                for(int i = 0; i < n; i++) {
                    int x = input.nextInt();
                    if(x == 0) count0++;  
                    if(x == 1) count1++;  
                }
                
                if(count0 == 0) {
                    System.out.println("NO");
                } 
                else if(count0 == 1) {
                    System.out.println("YES");
                } 
                else {
                    
                    if(count1 == 0) { 
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }

    }
}

