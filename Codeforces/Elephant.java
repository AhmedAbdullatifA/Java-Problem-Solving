//  https://codeforces.com/problemset/problem/617/A

import java.lang.reflect.Array;
import java.util.*;

public class Elephant { 
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int steps = 0;
            while(n >0){
                if(n >= 5){
                    n = n-5;
                } else if(n == 4){
                    n = n-4;
                } else if(n == 3){
                    n = n-3;
                } else if(n == 2){
                    n = n-2;
                } else {
                    n = n-1;
                }
                steps++;
            }
            System.out.println(steps);
        }
    }
}