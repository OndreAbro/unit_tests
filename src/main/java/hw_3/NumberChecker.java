package hw_3;


public class NumberChecker {

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    public boolean numberInInterval(int n) {
        return 25 <= n && n <= 100;
    }
}
