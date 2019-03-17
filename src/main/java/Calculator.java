import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int firstNumber = a.nextInt();
        String operationalSymbol = a.next();
        int secondNumber = a.nextInt();

        switch (operationalSymbol) {
            case "+":
                System.out.print(firstNumber + secondNumber);
                break;
            case "-":
                System.out.print(firstNumber - secondNumber);
                break;
            case "/":
                System.out.print(firstNumber / secondNumber);
                break;
            case "*":
                System.out.print(firstNumber * secondNumber);
                break;
        }
    }
}

