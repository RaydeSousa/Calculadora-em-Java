import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();

        byte exit = 0;

        while (exit < 1) {
            System.out.println("valor 1:");
            calc.x = scanner.nextInt();

            System.out.println("Escolha uma operação: +, -, *, /");
            System.out.println("Ou digite [sair] para encerrar a calculadora");
            scanner.nextLine();
            calc.op = scanner.nextLine();

            System.out.println("valor 2:");
            calc.y = scanner.nextInt();

            switch (calc.op) {
                case "+":
                    System.out.println(calc.x + calc.y);
                    break;
                case "-":
                    System.out.println(calc.x - calc.y);
                    break;
                case "*":
                    System.out.println(calc.x * calc.y);
                    break;
                case "/":
                    System.out.println(calc.x / calc.y);
                    break;
                case "sair":
                    exit = 1;

            }
        }

    }
}
