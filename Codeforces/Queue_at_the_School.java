// https://codeforces.com/problemset/problem/266/B

import java.util.*;

public class Queue_at_the_School { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int t = input.nextInt();
            input.nextLine();
            String s =  input.nextLine();
            char[] arr = s.toCharArray();
            while(t-- > 0){
                for(int i = 0 ; i < arr.length-1; i++){
                    if(arr[i] == 'B' && arr[i+1] == 'G'){
                        arr[i] = 'G';
                        arr[i+1] = 'B';
                        i++;
                    }
                }
            }
            for(char x : arr)
                System.out.print(x);
        }
    }
}