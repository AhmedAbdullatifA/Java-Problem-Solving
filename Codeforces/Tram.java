// https://codeforces.com/problemset/problem/116/A

import java.util.*;

public class Tram { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int a = 0,b = 0,c = 0,d = 0;
            while(n-- > 0){
                a = input.nextInt();
                b = input.nextInt();
                c=c+b-a;
                if(d < c)
                    d=c;
            }
            System.out.println(d);
        }
    }
}