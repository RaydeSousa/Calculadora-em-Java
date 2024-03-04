import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y;

        String op;

        int result;

        byte exit = 0;

        while (exit < 1) {

                      
            System.out.println("valor 1:");
            x = scanner.nextInt();

            System.out.println("Escolha uma operação: +, -, *, /");
            System.out.println("Ou digite [sair] para encerrar a calculadora");
            scanner.nextLine();
            op = scanner.nextLine();

            System.out.println("valor 2:");
            y = scanner.nextInt();

            switch (op) {
                case "+":
                    result = (x + y);
                    System.out.println(result);
                    break;
                case "-":
                    result = (x - y);
                    System.out.println(result);
                    break;
                case "*":
                    result = (x * y);
                    System.out.println(result);
                    break;
                case "/":
                    result = (x / y);
                    System.out.println(result);
                    break;
                case "sair":
                    exit = 1;

            }

        }

    }
}
