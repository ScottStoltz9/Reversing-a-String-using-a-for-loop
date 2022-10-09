import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a String you would like to reverse: ");
        String name = scanner.nextLine();

        for(int i = name.length(); i > 0; i--) {
            System.out.print(name.charAt(i - 1));
        }

    }
}