// https://codeforces.com/problemset/problem/2191/B

import java.util.*;
 
public class Array_Coloring {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            while(t-- > 0) {
                int size = input.nextInt();
                int arr1[] = new int[size];
                int arr2[] = new int[size];
                for(int i = 0; i < size; i++) {
                    int x = input.nextInt();
                    arr1[i] = x;
                }
                if (size <=1) {
                    System.out.println("YES");
                }
                else {
                    arr2=arr1.clone();
                    Arrays.sort(arr2);
                    boolean B=true;
                    for(int i=0;i<size-1;i++){
                     if((arr1[i]%2==0 && arr1[i+1]%2==0) || (arr1[i]%2==1 && arr1[i+1]%2==1)){
                         B=false;
                     }       
            }
            if (B) 
                System.out.println("YES");
            else 
                System.out.println("NO");
    }
    }}
}}
