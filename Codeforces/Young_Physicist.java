// https://codeforces.com/contest/69/problem/A

import java.util.*;

public class Young_Physicist {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            int sum1=0,sum2=0,sum3=0;
            while(t-- > 0){
                int[] arr = new int[3];
                for(int i=0;i<arr.length;i++){   
                    arr[i] = input.nextInt();
                    if(i==0)
                        sum1+=arr[i];
                    else if(i==1)
                        sum2+=arr[i];
                    else
                        sum3+=arr[i];
                }
            }
            if(sum1==0 && sum2==0 && sum3==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
