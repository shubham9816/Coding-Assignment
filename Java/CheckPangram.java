import java.util.*;

public class CheckPangram {

    public static boolean pangram(String str) {

        boolean[] flag = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }

            flag[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (flag[i] == false) {
                return (false);
            }
        }

        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        if (pangram(str)) {
            System.out.print("is Panagram");
        } else {
            System.out.print("is not Panagram");
        }
    }

}
