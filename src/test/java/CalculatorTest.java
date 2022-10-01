import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class CalculatorTest {

    @Test
    public void testOfMultiplicationByScanner(){

        BigInteger expectedValue = new BigInteger("370370370370370370370370329629629629629629629629630");
        BigInteger realValue = Calculator.multiplicationByScannerInput
                (new BigInteger("5555555555555555555555555"),
                        new BigInteger("66666666666666666666666666"));
        Assertions.assertEquals(expectedValue, realValue, "result should be: 370370370370370370370370329629629629629629629629630");
    }

    @Test
    public void testOfMultiplicationByArguments(){

        BigInteger expectedValue = new BigInteger("6913580246913580246775308641975308641976");
        BigInteger realValue = Calculator.multiplicationByArgumentsInput
                (new BigInteger("77777777777777777777"),
                        new BigInteger("88888888888888888888"));
        Assertions.assertEquals(expectedValue, realValue, "result should be: 6913580246913580246775308641975308641976");
    }
}
