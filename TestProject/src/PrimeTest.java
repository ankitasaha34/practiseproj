import static org.junit.Assert.*;
 
import java.util.*;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
 
import org.junit.runners.Parameterized.Parameters;
 
@RunWith(Parameterized.class)
public class PrimeTest {

    private Integer input;
    private Boolean expectedResult;
    Prime p;

    public PrimeTest(Integer nums,Boolean expectedResult)
    {
        input=nums;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection pNums()
    {
        return Arrays.asList(new Object[][] 
        		//object is parent class by default for all the classes even what we create
        		//creating object using parent class Object with 2 sets[]-value,][]-true/false
        		{
             //to keep ur information in form of list
            {2,true},
            {6,false},
            {19,true},
            {22,false},
            {23,true},
        });
    }
    @Before
    public void initialize()
    {
        p=new Prime();
    }
 
    @Test
    public void testValidate() {

        assertEquals(expectedResult,p.validate(input) );

    }
 
}
	
	
	
	
	

/*
	@Test
	  public void testValidate() {
        Integer i=new Integer(7);
        Prime p=new Prime();
        assertEquals(true,p.validate(i));
        }
*/

