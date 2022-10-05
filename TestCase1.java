import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1<T> {

	private final Calculator<T> c1= new Calculator<>( );	
	@Test
	void test1()  {
		
		double x = 3000;
		double y =1;
		double result = 3001;
		
		assertEquals(result,c1.add(x, y));
	}

	@Test
	void test2() {
		

		double x = 12 ;
		double y =-12 ;
		double result = 0 ;
		
		assertEquals(result,c1.add(x, y));
	}
	@Test
	void test3()  {
	
		double x = 0;
		double y =0;
		double result = 0;
		
		assertEquals(result,c1.add(x, y));
	}
	
	
	@Test
	void test4() {
		

		double x = -10;
		double y =-10;
		double result =-20 ;
		
		assertEquals(result,c1.add(x, y));
	}
	@Test 
	void test5()  {
		
		String x ="Aksh";
		double y =1;
		double result = 2;
		try {
		assertEquals(result,c1.add(x, y));
			}
		catch (IllegalArgumentException e){
//			fail("Failed");
		}
		}

}
