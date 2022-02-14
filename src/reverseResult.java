
import java.util.ArrayList;
import java.util.Scanner;

public class reverseResult {

    static String functionA(int n) { // A
        // This method is check number Odd,Even and convert to string.
        String number = Integer.toString(n);
        String solution = "";
        for (int i = 0; i < number.length(); i++) {
            int target = Character.getNumericValue(number.charAt(i));
            if (target % 2 == 0) {
                solution += "Even" + target;
            } else {
                solution += "Odd" + target;
            }
        }
        System.out.println("Function A : " + solution);
        return functionB(solution);
    }

    static String functionB(String text) { // B
        // This method is reverse word Odd,Even and return to string.
        int index = 0;
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                String tempString = text.substring(index, i).toUpperCase();
                reverse += new StringBuffer(tempString).reverse().toString() + text.charAt(i);
                index = i + 1;
            }
        }
        System.out.println("Function B : " + reverse);
        return functionC(reverse);
    }

    static String functionC(String text) { // C
        // This method is convert string to ASCII.
        ArrayList<Integer> asciiString = new ArrayList<Integer>();
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                asciiString.add(Character.getNumericValue(text.charAt(i)));
                str += Character.getNumericValue(text.charAt(i));
            } else {
                asciiString.add((int) text.charAt(i));
                str += (int) text.charAt(i);
            }
        }
        System.out.println("Function C : " + str);
        return functionD(asciiString);
    }

    static String functionD(ArrayList<Integer> text) { // D
        // This method is convert ASCII to string.
        String str = "";
        for (int i : text) {
            if (i >= 0 && i <= 10) {
                str += i;
            } else {
                str += Character.toString((char) i);
            }
        }
        System.out.println("Function D : " + str);
        return functionE(str);
    }

    static String functionE(String text) { // E
        // This method is reverse string to original string.
        int index = 0;
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                String tempString = text.substring(index, i).toLowerCase();
                String str = new StringBuffer(tempString).reverse().toString();
                reverse += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + text.charAt(i);
                index = i + 1;
            }
        }
        System.out.println("Function E : " + reverse);
        return functionF(reverse);
    }

    static String functionF(String text) { // F
        // This method is reverse string to original input.
        String number = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                number += text.charAt(i);
            }
        }
        System.out.println("Function F : " + number);
        return number;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            // Input number form user
            System.out.println("***GUIDE***");
            System.out.println("If input less more 0 program is end.");
            System.out.print("Enter your number : ");
            int input = keyboard.nextInt();
            if (input < 0) {
                break;
            } else {
                functionA(input);
            }
        }
    }
}
