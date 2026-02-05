//  https://codeforces.com/problemset/problem/58/A

import java.util.*;

public class Chat_room {  
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        String s = input.nextLine();
        String t = "hello";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            if (j == 5)
                break;
        }

        if (j == 5) 
            System.out.println("YES");
        else
            System.out.println("NO");
            }
    }
}