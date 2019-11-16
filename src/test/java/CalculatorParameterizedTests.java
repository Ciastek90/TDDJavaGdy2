import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParameterizedTests {
    @Test
    @Parameters({"10,20,30","30,40,70","15,15,30", "1,2,5"})
    public void sum_parametrized(int a, int b, int expected){
        final double actual = Calculator.sum(a,b);

        assertThat(actual).isEqualTo(expected);
    }
}
