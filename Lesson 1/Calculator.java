public class Calculator {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 4;
        char operation = '^';

        if(operation == '+') {
            System.out.println(num1 + num2);
        } else if(operation == '-') {
            System.out.println(num1 - num2);
        } else if(operation == '*') {
            System.out.println(num1 * num2);
        } else if(operation == '/') {
            System.out.println(num1 / num2);
        } else if(operation == '%') {
            System.out.println(num1 % num2);
        } else if(operation == '^') {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        }
    }
}