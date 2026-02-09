//  https://codeforces.com/problemset/problem/122/A

import java.util.*;

public class Lucky_Division { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = {4, 7, 44, 47, 74, 77 , 444 , 447 , 474 , 
                477 , 744 , 747 , 774 , 777};
            int check = 0;
            for(int i =0 ; i < arr.length ; i++){
                if(n % arr[i]==0)
                    check++;
            }
            System.out.println(check > 0 ? "YES" : "NO");
        }
    }

}