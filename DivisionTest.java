package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void test0() {
		calculatorClass test = new calculatorClass();
		assertEquals(4.5,test.divide(9, 2));
		
	}
	
	@Test
	void test1() {
		calculatorClass test = new calculatorClass();
		assertEquals(3.333333,test.divide(10, 3),0.0000004);
		
	}
	
	@Test
	void test2() {
		calculatorClass test = new calculatorClass();
		assertEquals(100,test.divide(-300, -3)); 
		
	}
	
	@Test 
	void test3() {
		calculatorClass test = new calculatorClass();
		assertThrows(RuntimeException.class, ()->{test.divide(10, 0);});
	}


}
