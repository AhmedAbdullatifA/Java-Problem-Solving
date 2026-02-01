// https://codeforces.com/contest/977/problem/A

import java.util.*;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long num1=input.nextLong();
            String num2=String.valueOf(num1);
            int n=input.nextInt();
            while(n-- > 0){
                if(num2.charAt(num2.length()-1)=='0'){
                    num2=num2.substring(0, num2.length()-1);
                    num1=Integer.parseInt(num2);
            }
                else{
                    num1--;
                    num2=String.valueOf(num1);
                }
            }
            System.out.println(num2);
        }
    }
}
