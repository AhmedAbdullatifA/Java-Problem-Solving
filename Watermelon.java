// https://codeforces.com/problemset/problem/4/A
import java.util.*;
 
public class Watermelon {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            if(n<=2) System.out.println("NO");
            else if(n%2==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
