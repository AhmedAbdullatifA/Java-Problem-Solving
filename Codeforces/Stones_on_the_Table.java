//  https://codeforces.com/problemset/problem/266/A

import java.lang.reflect.Array;
import java.util.*;

public class Stones_on_the_Table {  
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int count = 0;
            String s = input.next();
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}