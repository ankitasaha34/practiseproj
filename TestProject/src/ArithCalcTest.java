import static org.junit.Assert.*;

import org.junit.Test;

public class ArithCalcTest {

	@Test(expected=ArithmeticException.class)
	public void testCalc() {
		ArithCalc a=new ArithCalc();
		
	a.calc(2, 0);
	}

}
