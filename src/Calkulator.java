import java.util.Scanner;

public class Calkulator {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Вводим первое число");
                float operand1 = scanner.nextFloat();
            System.out.println("Введите операцию(+, -, *, /, %)");
                char operation = scanner.next().charAt(0);
            System.out.println("Вводим второе число");
                float operand2 = scanner.nextFloat();

            switch (operation) {
                case '+':
                    float operation1 = operand1 + operand2;
                    System.out.println("Результат сложения: " + operation1);
                    break;
                case '-':
                    float operation2 = operand1 - operand2;
                    System.out.println("Результат вычитания: " + operation2);
                    break;
                case '*':
                    float operation3 = operand1 * operand2;
                    System.out.println("Результат умножения: " + operation3);
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Делить на ноль нельзя");
                    }
                    float operation4 = operand1 / operand2;
                    System.out.println("Результат деления: " + operation4);
                    break;
                case '%':
                    float operation5 = operand1 % operand2;
                    System.out.println("Остаток от деления: " + operation5);
                    break;
                default:
                    System.out.println("Введены не верные данные");
                    break;

            }
            System.out.println("continue?y/n");
                String xun = scanner.next();
            if (xun.equals("y")) {
                System.out.println("Продолжить использование");
            } else if (xun.equals("n")) {
                System.out.println("Спасибо за использование этого вычисления, добро пожаловать в следующий раз, увидимся позже");
                break;
            }
        }
    }
}