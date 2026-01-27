//  https://codeforces.com/problemset/problem/339/A

import java.util.*;

public class Helpful_Maths {  
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s = input.nextLine();
            String[] num = s.split("\\+");
            Arrays.sort(num);
            for (int i = 0; i<num.length; i++) {
                System.out.print(num[i]+ ""+ (i==num.length - 1 ? "" : "+"));
            }
        }
    }
}