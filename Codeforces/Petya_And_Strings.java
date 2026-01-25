// https://codeforces.com/contest/112/problem/A
import java.util.*;

public class Petya_And_Strings {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s1 = input.nextLine().toLowerCase();
            String s2 = input.nextLine().toLowerCase();
            int result = s1.compareTo(s2);

            if (result < 0) {
                System.out.println("-1");
            } else if (result > 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}

