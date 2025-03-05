public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        for (int c = 0; c <= 17; c += 2) {
            System.out.println(c);
        }

        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        for (int y = 1904; y <= 2096; y += 4) {
            System.out.println(y + " год является високосным");
        }

        for (int e = 7; e <= 98; e += 7) {
            System.out.print(e + " ");
        }

        int number = 1;
        for (int f = 0; f < 10; f++) {
            System.out.print(number + " ");
            number *= 2;
        }

        int deposit = 29000;
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        int contribution = 29000;
        double balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += contribution;
            balance += balance * 0.01;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, balance);
        }

        for (int g= 1; g <= 10; g++) {
            System.out.println("2 * " + g + " = " + (2 * g));
        }

    }
}