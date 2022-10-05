import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase6<T>{
	
	private final Calculator<T> c1= new Calculator<>( );	
	
	
	@Test
	void test1()  {
		
		double x = 12;
		double y =0;
		double result = 0;
		try {
			assertEquals(result,c1.percentage(x,y));
				}
			catch (IllegalArgumentException e){
//				fail("Failed");
				System.out.print(e);
			}
			
		
	}

	@Test
	void test2() {
		

		double x = 12;
		double y =12;
		double result = 100;
		
		assertEquals(result,c1.percentage(x,y));
	
	}
	@Test
	void test3()  {
		double x = 12;
		double y =6;
		double result = 200;
		
		assertEquals(result,c1.percentage(x,y));
	}
	
	
	@Test
	void test4() {
		
		double x = -12;
		double y =24;
		double result = -50;
		
		assertEquals(result,c1.percentage(x,y));
	}
	@Test 
	void test5()  {
		
		String x ="Aksh";
//		double y =1;
		double result = 2;
		try {
		assertEquals(result,c1.square(x));
			}
		catch (IllegalArgumentException e){
//			fail("Failed");
			System.out.print(e);
		}
		
		}
}
