import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
 
class AfterAnnotationTest {

    @RepeatedTest(2)
    void addNum(TestInfo testInfo,RepetitionInfo repetitionInfo)
    {
        System.out.println("Runnning Test : "+ repetitionInfo.getCurrentRepetition());
        assertEquals(2,Calculator.add(1,1),"adding 1 + 1");
    }
 
    //@Disabled
    @Test
    void testCalc() {
        assertEquals(6,Calculator.add(2, 4));

    }
    @AfterAll
    public static void cleanUp()
    {
        System.out.println("After all cleanup methods");
    }

    @AfterEach
    public void cleanUpEach()
    {
        System.out.println("After each test case");
    }
 
}