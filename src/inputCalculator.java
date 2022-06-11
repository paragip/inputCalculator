import java.util.Scanner;

public class inputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {

        int sum = 0;
        int numberOfItems = 0;
        long average = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                numberOfItems++;
                sum += number;
                average = Math.round((double)sum / (double)numberOfItems);
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

}
