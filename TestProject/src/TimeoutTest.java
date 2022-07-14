import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(10)
class TimeoutTest {

	@Test
	void testInterrupted() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
	}
	
	@Test
	void testGetValue() throws InterruptedException {
		assertTimeout(Duration.ofSeconds(4), () -> {
			
		getValue();}
		
				);
	}
	String getValue() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(2);
		return "";
	}

}