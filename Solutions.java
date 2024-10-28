import java.util.Arrays;
import java.util.Scanner;

public class Solutions {

    // EpicGame class logic
    public static void epicGame() {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int heap = scan.nextInt();
        
        while (true) {
            heap -= getGCD(n1, heap);
            if (heap == 0) {
                System.out.println(0);
                break;
            }
            
            heap -= getGCD(n2, heap);
            if (heap == 0) {
                System.out.println(1);
                break;
            }
        }
        
        scan.close();
    }

    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }

    // Tram class logic
    public static void tram() {
        Scanner scan = new Scanner(System.in);
        int stops = scan.nextInt();
        int enter, out, i, rem = 0, max = 0;
        
        for (i = 0; i < stops; i++) {
            out = scan.nextInt();
            enter = scan.nextInt();
            
            if (i == 0) {
                rem = enter;
                max = rem;
            } else {
                rem += enter - out;
                max = Math.max(max, rem);
            }
        }
        
        System.out.println(max);
        scan.close();
    }

    // AmusingJoke class logic
    public static void amusingJoke() {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine().toLowerCase();
        String input2 = scan.nextLine().toLowerCase();
        String input3 = scan.nextLine().toLowerCase();

        // Concatenate input1 and input2
        String resultOfOneAndTwo = input1 + input2;

        // Sort characters of resultOfOneAndTwo and input3
        char[] resultArray = resultOfOneAndTwo.toCharArray();
        char[] inputChar = input3.toCharArray();
        
        Arrays.sort(resultArray);
        Arrays.sort(inputChar);

        // Compare sorted arrays
        if (Arrays.equals(resultArray, inputChar)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scan.close();
    }
}
