//  https://codeforces.com/problemset/problem/486/A

import java.util.*;

public class Calculating_Function {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long n = input.nextLong();
            System.out.println(n%2==0 ? n/2 : -(1+n)/2);
        }
    }

}