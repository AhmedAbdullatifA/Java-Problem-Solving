// https://codeforces.com/problemset/problem/467/A

import java.util.*;

public class George_and_Accommodation { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int count = 0;
            while(n-- > 0){
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(num2 - num1 >=2)
                    count++;
            }
            System.out.println(count);
        }
    }
}