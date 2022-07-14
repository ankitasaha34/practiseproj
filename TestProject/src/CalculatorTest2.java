package example1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class CalculatorTest2 {

    private Integer input;
    private Integer expectedResult;
    private Calculator c;

    public CalculatorTest2(Integer nums,Integer expectedResult) {
        this.input = nums;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Collection pNums() {
        return Arrays.asList(new Object[][] {
            {2,2},
            {3,6},
            {5,120},
            {6,720},
            {1,1},
        });
    }
    @Before
    public void initiate() {
        c=new Calculator();
    }
    @Test
    public void testValidate() {
        Integer output = c.fact(input);
        assertEquals(expectedResult,output);
//        assertEquals(24,c.fact(4));
    }

}