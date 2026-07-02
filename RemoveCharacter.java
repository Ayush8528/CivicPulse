package String;
import java.util.Scanner;
public class RemoveCharacter {
    public static String removeChars(String str1, String str2) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        String result = removeChars(str1, str2);
        System.out.println("After removing characters: " + result);
        sc.close();
    }
}