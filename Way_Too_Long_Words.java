// https://codeforces.com/problemset/problem/71/A

import java.util.*;
 
public class Way_Too_Long_Words {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            while(t-->0){
                String s=input.next();
                if (s.length()<=10) {
                    System.out.println(s);
                }
                else {
                    System.out.print(s.charAt(0));
                    System.out.print(s.length()-2);
                    System.out.println(s.charAt(s.length()-1));
                }
            }

    }
//############################# OR
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            while(t-->0){
                String s=input.next();
                char arr[]=s.toCharArray();
                if (s.length()<=10) {
                    System.out.println(s);
                }
                else {
                    System.out.print(arr[0]);
                    System.out.print(s.length()-2);
                    System.out.println(arr[arr.length - 1]);
                }
            }
        }
    }
}