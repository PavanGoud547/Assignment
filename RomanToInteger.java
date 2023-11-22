import java.util.Scanner;
public class RomanToInteger {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase();
	        
	        int integerValue = romanToInt(romanNumeral);
	        System.out.println("The Roman numeral " + romanNumeral + " is equal to " + integerValue);
	    }

	    private static int romanToInt(String s) {
	        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	        int integerValue = 0;
	        int i = 0;
	        while (i < s.length()) {
	            for (int j = 0; j < symbols.length; j++) {
	                if (i + symbols[j].length() <= s.length() &&
	                        s.substring(i, i + symbols[j].length()).equals(symbols[j])) {
	                    integerValue += values[j];
	                    i += symbols[j].length();
	                    break;
	                }
	            }
	        }
	        return integerValue;
	    }
	}