// https://codeforces.com/contest/118/problem/A

import java.util.*;

public class String_Task {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s1=input.nextLine();
            ArrayList<Character> s2 =new ArrayList<>();
            s1=s1.toLowerCase();
            for(int i=0;i<s1.length();i++){
                if (s1.charAt(i)=='a' || s1.charAt(i)=='o' || 
                s1.charAt(i)=='y' || s1.charAt(i)=='e' || s1.charAt(i)=='u'
                || s1.charAt(i)=='i') 
                    continue;
                else
                    s2.add(s1.charAt(i));
            }
            for(int i=0;i<s2.size();i++){
                System.out.print("."+s2.get(i));
            }
        }
    }
}
