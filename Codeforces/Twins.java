//  https://codeforces.com/problemset/problem/160/A

import java.util.*;

public class Twins {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++){
                arr[i] = input.nextInt();
                total+= arr[i]; 
            }
            Arrays.sort(arr);
            int sum = 0,count = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                sum += arr[i];count++;
                if (sum > total - sum)
                    break;
            }
            System.out.println(count);
        }
    }
}