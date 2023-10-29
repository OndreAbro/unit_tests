package hw_1.Calculator;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        if (purchaseAmount < 0) {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }

        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Некорректное значение скидки");
        }

        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }

}
