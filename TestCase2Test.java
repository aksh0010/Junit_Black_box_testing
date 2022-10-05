import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase2Test<T> {

	private final Calculator<T> c1= new Calculator<>( );	

	@Test
	void test1()  {
		
		double x = 3000;
		double y =1;
		double result = 2999;
		
		assertEquals(result,c1.sub(x, y));
	}

	@Test
	void test2() {
		

		double x = 12 ;
		double y =-1 ;
		double result = 13 ;
		
		assertEquals(result,c1.sub(x, y));
	}
	@Test
	void test3()  {
	
		double x = 0;
		double y =0;
		double result = 0;
		
		assertEquals(result,c1.sub(x, y));
	}
	
	
	@Test
	void test4() {
		

		double x = -10;
		double y =-10;
		double result =0 ;
		
		assertEquals(result,c1.sub(x, y));
	}
	@Test 
	void test5()  {
		
		String x ="Aksh";
		double y =1;
		double result = 2;
		try {
		assertEquals(result,c1.sub(x, y));
			}
		catch (IllegalArgumentException e){
//			fail("Failed");
			System.out.print(e);
		}
		
		}
	
	
}
