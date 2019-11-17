import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTDDTests {
    @Test
    public void square_a2_4(){
        final double expected = 4;

        final double actual = CalculatorTDD.square(2.0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void power_a3n3_27(){
        final double expected = 27;

        final double actual = CalculatorTDD.power(3.0,3.0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void absolute_aNegative4_4(){
        final double expected = 4;

        final double actual = CalculatorTDD.absolute(-4.0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void reversal_a2_0_5(){
        final double expected = 0.5;

        final double actual = CalculatorTDD.reversal(2.0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void squareReversal_a2_0_25(){
        final double expected = 0.25;

        final double actual = CalculatorTDD.squareReversal(2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reversal_a0_IllegalArgumentException(){
        CalculatorTDD.reversal(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void squareRoot_aNegative2_IllegalArgumentException(){
        CalculatorTDD.squareRoot(-2);
    }

    @Test
    public void squareRoot_a4_2(){
        final double expected = 2;

        final double actual = CalculatorTDD.squareRoot(4);

        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void root_aNegative2bEven_IllegalArgumentException(){
        CalculatorTDD.root(-2,4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void root_aNegative8b3_IllegalArgumentException(){
        CalculatorTDD.root(-8,3);
    }

    @Test
    public void root_a8b3_2(){
        final double expected = 2;

        final double actual = CalculatorTDD.root(8,3);

        assertThat(actual).isEqualTo(expected);
    }
}
