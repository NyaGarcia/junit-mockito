import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.helloworld.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testAdd() {
		when(calculatorService.add(10.5, 2)).thenReturn(12.5);
		assertEquals(calculatorService.add(10.5, 2), 12.5, 0);
	}
	
	@Test
	public void testSubtract() {
		when(calculatorService.subtract(10, 5.5)).thenReturn(4.5);
		assertEquals(calculatorService.subtract(10, 5.5), 4.5, 0);
	}
	
	@Test
	public void testMultiply() {
		when(calculatorService.multiply(2, 2)).thenReturn(4.0);
		assertEquals(calculatorService.multiply(2, 2), 4, 0);
	}
	
	@Test
	public void testDivide() {
		when(calculatorService.divide(10, 2)).thenReturn(5.0);
		assertEquals(calculatorService.divide(10, 2), 5, 0);
	}
}
