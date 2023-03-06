import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select an option:\n1. Encrypt a message\n2. Decrypt a message\n3. Exit");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println("enter a message:");
        String message = input.nextLine();

        switch (choice) {
            case 1:
                String encrypted = encrypt(message);
                System.out.println(encrypted);
                break;
            case 2:
                String decrypted = decrypt(message);
                System.out.println(decrypted);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static String encrypt(String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            int index = alphabet.indexOf(Character.toLowerCase(ch));

            if (index == -1) {
                encrypted += ch;
            } else {
                char encryptedCh = alphabet.charAt((index + 3) % 26);
                encrypted += Character.isUpperCase(ch) ? Character.toUpperCase(encryptedCh) : encryptedCh;
            }
        }
        return encrypted;
    }

    public static String decrypt(String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            int index = alphabet.indexOf(Character.toLowerCase(ch));
            if (index == -1) {
                decrypted += ch;
            } else {
                char decryptedCh = alphabet.charAt((index - 3 + 26) % 26);
                decrypted += Character.isUpperCase(ch) ? Character.toUpperCase(decryptedCh) : decryptedCh;
            }
        }
        return decrypted;
    }
}
