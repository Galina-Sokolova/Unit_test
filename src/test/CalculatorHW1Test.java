import Seminar.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorHW1Test {
    @Test
    public void testNormalDiscount() {
        assertThat(Calculator.calculateDiscount(1000, 10)).isEqualTo(900);
    }

    @Test
    public void testZeroDiscount() {
        assertThat(Calculator.calculateDiscount(1000, 0)).isEqualTo(1000);
    }

    @Test
    public void testZeroSumProducts() {
        assertThat(Calculator.calculateDiscount(0, 50)).isEqualTo(0);
    }

    @Test
    public void testFloatSumProducts() {
        assertThat(Calculator.calculateDiscount(200.5, 50)).isEqualTo(100.25);
    }

    @Test
    public void testBigDiscount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(1000, 100))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть больше 90%");
    }

    @Test
    public void testNegativeDiscount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть меньше 0%");
    }

    @Test
    public void testNegativeDiscountAndSumProducts() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-1000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть меньше 0%");
    }

    @Test
    public void testNegativeSumProduct() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-1000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть меньше 0");
    }
}