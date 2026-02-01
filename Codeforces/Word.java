//  hhttps://codeforces.com/problemset/problem/59/A

import java.util.*;

public class Word {  
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s = input.nextLine();
            int count_upper=0,count_lower=0;
            for(int i=0; i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i)))
                    count_upper++;
                else
                    count_lower++;
            }
            if (count_upper>count_lower)
                System.out.println(s.toUpperCase());
            else
                System.out.println(s.toLowerCase());

        }
    }
}