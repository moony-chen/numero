import java.util.Arrays;

public class Converter {

    private int[] numbers = new int[] {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private String[] symbols = new String[] {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String convert(int number) {
        int localNumber = number;
        String result = "";
        for (int i = 0; i < numbers.length; i ++) {
            while(localNumber >= numbers[i]) {
                result += symbols[i];
                localNumber = localNumber - numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Converter().convert( Integer.parseInt(args[0]) ));
    }
}
