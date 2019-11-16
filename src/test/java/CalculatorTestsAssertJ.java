import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTestsAssertJ {
    @Test
    public void sum_numberA2numberB2_4(){
        final double expected = 4;

        final double actual = Calculator.sum(2,2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divide_divided2divider0_IllegalArgumentException() {
        assertThatThrownBy(() -> {
            Calculator.divide(2, 0);
        }).hasMessageEndingWith("przez 0");
    }
}
