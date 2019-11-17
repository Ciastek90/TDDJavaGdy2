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

    @Test
    @Parameters(method = "getData")
    public void sum_parametrizedByMethod(int a, int b, int expected){
        final double actual = Calculator.sum(a,b);

        assertThat(actual).isEqualTo(expected);
    }

    private Object[] getData() {
        return new Object[]{
                new Object[]{10, 20, 30},
                new Object[]{30, 40, 70},
                new Object[]{15, 15, 30},
                new Object[]{1, 2, 5}
        };
    }

    @Test
    @Parameters(source = SumParameterizedData.class)
    public void sum_parametrizedByClass(double a, double b, double expected){
        final double actual = Calculator.sum(a,b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Parameters(method = "getFibonaciData")
    public void fibonaci_parametrizedByMethod(int n, int expected){
        final int actual = Calculator.getFibonaciNumber(n);

        assertThat(actual).isEqualTo(expected);
    }

    private Object[] getFibonaciData(){
        return new Object[]{
                new Object[]{0,0},
                new Object[]{1,1},
                new Object[]{2,1},
                new Object[]{3,2},
                new Object[]{4,3},
                new Object[]{5,5},
                new Object[]{6,8},
                new Object[]{7,13},
                new Object[]{8,21},
                new Object[]{9,34},
                new Object[]{10,55}
        };
    }

    @Test
    @Parameters(source = IsEvenData.class)
    public void isEven_parameterizedByClass(int a, boolean expected){
        final boolean actual = Calculator.isEven(a);

        assertThat(actual).isEqualTo(expected);
    }
}
