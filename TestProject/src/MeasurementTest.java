import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementTest {

	@Test
	public void testAdd() {
		Measurement m=new Measurement(5);
		Measurement m1=new Measurement(10);
		m.add(m1);
		assertEquals(15,m.getValue());
	}

	@Test
	public void testSub() {
		Measurement m=new Measurement(5);
        m.sub(m);
		assertEquals(0,m.getValue());
	}

}
