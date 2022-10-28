import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercent(double a, int d) {
        double pay = a * Math.pow((1 + 0.06 / 12), 12 * d);
        return random(pay);
    }

    double calculateSimplePercent(double doubleAmount, int depositPeriod) {
        return random(doubleAmount + doubleAmount * 0.06 * depositPeriod);
    }

    double random(double value) {
        double scaLe = Math.pow(10, 2);

        return Math.round(value * scaLe) / scaLe;
    }

    void doImportantJob() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amountSum = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        depositTerm = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double timeOfTerms = 0;
        if (action == 1) {
            timeOfTerms = calculateSimplePercent(amountSum, depositTerm);
        } else if (action == 2) {
            timeOfTerms = calculateComplexPercent(amountSum, depositTerm);
        }
        System.out.println("Результат вклада: " + amountSum + " за " + depositTerm + " лет превратятся в " + timeOfTerms);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }

}