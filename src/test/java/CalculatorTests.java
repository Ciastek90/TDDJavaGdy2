import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTests {
    @Test
    public void sum_numberA10numberB20_30(){
        //Arrange
        final double expected = 30;

        //Act
        final double actual = Calculator.sum(10,20);

        //Assert
        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test
    public void substraction_numberA15numberB5_10(){
        final double expected = 10;

        final double actual = Calculator.substraction(15,5);

        Assert.assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void multiply_multiplicant5multiplier20_100(){
        final double expected = 100;

        final double actual = Calculator.multiply(5,20);

        Assert.assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void divide_dividend10divider5_2(){
        final double expected = 2;

        final double actual = Calculator.divide(10,5);

        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test
    public void divide_dividend10divider0_IllegalArgumentException(){
        try {
            Calculator.divide(10, 0);
            Assert.fail("Wyjątek nie został wyrzucony");
        } catch (IllegalArgumentException e){
            System.out.println("wyjątek został rzucony");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_dividend15divider0_IllegalArgumentException(){
        Calculator.divide(15,0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void divide_dividend1divider0_IllegalArgumentException(){
        thrown.expect(IllegalArgumentException.class);
        Calculator.divide(1,0);
    }

    @Test
    public void log_aEulerValue_1(){
        final double expected = 1;

        final double actual = Calculator.log(Math.E);

        Assert.assertEquals(expected,actual, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_aNegative2_IllegalArgumentException(){
        Calculator.log(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_a0b0_IllegalArgumentException(){
        Calculator.log(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_a0b1_IllegalArgumentException(){
        Calculator.log(0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_a2b0_IllegalArgumentException(){
        Calculator.log(2,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_a1b1_IllegalArgumentException(){
        Calculator.log(1,1);
    }

    @Test
    public void log_a2b4_2(){
        final double expected = 2;

        final double actual = Calculator.log(2,4);

        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test
    public void pow_a2b2_4(){
        final double expected = 4;

        final double actual = Calculator.pow(2,2);

        Assert.assertEquals(expected,actual, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrt_aNegative2_IllegalArgumentException(){
        Calculator.sqrt(-2);
    }

    @Test
    public void sqrt_a4_2(){
        final double expected = 2;

        final double actual = Calculator.sqrt(4);

        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test
    public void square_aNegative3_9(){
        final double expected = 9;

        final double actual = Calculator.square(-3);

        Assert.assertEquals(expected,actual, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void root_aNegative1b2_IllegalArgumentException(){
        Calculator.root(-1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void root_a1b0_IllegalArgumentException(){
        Calculator.root(1,0);
    }

    @Test
    public void root_a4b2_2(){
        final double expected = 2;

        final double actual = Calculator.root(4,2);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    @Ignore
    public void test(){
        Object o = null;
        o.toString();
    }
}