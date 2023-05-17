import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]) {
        String string = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + str.charAt(i);
        }
        if (str.equals(string)) {
            System.out.println(str + " is a palindrome");
        } else
            System.out.println(str + " is not a palindrome");
    }
}
