public class Hw_3 {
    public static void main(String[] args) {
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        double[] array = {2.1, -3.5, 3.1, 4.7, -7.8, 3.7, 5.6, 6.8, 4.5,
                9.1, 6.1, -10.3, 2.7, -4.9, 4.0,};
        for (double num : array) {
            if (foundNegative && num > 0) {
                sum += num;
                count++;
            } else if (num < 0) {
                foundNegative = true;
            }

        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое :" + average);
        } else {
            System.out.println("После первого отрицательного числа положительных чисел нет.");
        }
    }
}
