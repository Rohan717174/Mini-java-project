import java.util.Scanner;
import java.util.Random;
// <------- CipherForge ------->

// Personalized Java Password Generator
// Presenting by, 
// Akash, Alamin, Ariful, Tanvir, Mehedi, Naim, Rifat
public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("           =====> CipherForge <=====           ");
        System.out.println();
        System.out.println();
        System.out.println();
        // 1. Get user details via Scanner
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().replaceAll("\\s+", "");
        
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine().replaceAll("\\s+", "");
        
        System.out.print("Enter total number of random characters to add: ");
        int randomLength = scanner.nextInt();
        
        // 2. Call the updated method
        String newPassword = generatePassword(name, color, randomLength);
        
        System.out.println("\nGenerated Password: " + newPassword);
        
        scanner.close();
    }

    // Method to generate custom password with random padding on both sides
    public static String generatePassword(String name, String color, int randomLength) {
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();

        // Divide the random count in half (odd numbers round up for the front)
        int frontLength = (int) Math.ceil(randomLength / 2.0);
        int backLength = randomLength / 2;

        // Generate front random characters
        StringBuilder frontRandom = new StringBuilder();
        for (int i = 0; i < frontLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            frontRandom.append(allowedChars.charAt(randomIndex));
        }

        // Generate back random characters
        StringBuilder backRandom = new StringBuilder();
        for (int i = 0; i < backLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            backRandom.append(allowedChars.charAt(randomIndex));
        }
        /* Thank You So Much Sir */

        // Combine: Front Random + Name + Color + Back Random
        return frontRandom.toString() + name + color + backRandom.toString();
    }
}
