package hw_1.Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {


    public static void main(String[] args) {

        System.out.println(Calculator.calculatingDiscount(300, 30));

        assertThat(Calculator.calculatingDiscount(1000, 1)).isEqualTo(990);
        assertThat(Calculator.calculatingDiscount(0, 90)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(256, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(999, 0)).isEqualTo(999);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1234, -45)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(5, 101)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-100, 30)
        ).isInstanceOf(ArithmeticException.class);

    }

}
