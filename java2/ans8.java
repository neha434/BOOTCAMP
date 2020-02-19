import java.util.Scanner;

public class ans8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            str = sc.next();
            if (str.equals("done")) {
                System.out.println("\nentered Done");
                break;
            } else {
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    System.out.println("first character and last character are same: ");
                }
            }
        }
    }
}
