import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Character> list = new ArrayList<>();
        if (str.length() <= 50 && str.length() >= 0) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] >= '0' && chars[i] <= '9') || (chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                    if (chars[i] == '0') {
                        list.add('9');
                    } else if (chars[i] == 'a') {
                        list.add('Z');
                    } else if (chars[i] == 'A') {
                        list.add('a');
                    } else {
                        if (chars[i] >= '1' && chars[i] <= '9') {
                            list.add((char) (chars[i] - 1));
                        } else if (chars[i] >= 'b' && chars[i] <= 'z') {
                            list.add((char) (chars[i] - 33));
                        } else if (chars[i] >= 'B' && chars[i] <= 'Z') {
                            list.add((char) (chars[i] + 31));
                        }
                    }
                }
            }
        } else {
            list.add('0');
        }
        for (char l : list) {
            System.out.print(l);
        }
    }
}
