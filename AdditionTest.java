package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test0() {
		calculatorClass test = new calculatorClass();
		int result = test.add(9, 2);
		assertEquals(11,result);
		
	}
	
	@Test
	void test1() {
		calculatorClass test = new calculatorClass();
		int result = test.add(10, 0);
		assertEquals(10,result);
		
	}
	
	@Test
	void test2() {
		calculatorClass test = new calculatorClass();
		int result = test.add(-300, -22);
		assertEquals(-322,result); 
		
	}

}
