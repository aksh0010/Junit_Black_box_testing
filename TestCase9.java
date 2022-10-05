import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase9<T>{
	
	private final Calculator<T> c1= new Calculator<>( );		
	
	
	@Test
	void test1()  {
		
		double x = 12;
		double result = 12;
		
		assertEquals(result,c1.abs(x));
	}

	@Test
	void test2() {
		

		double x = 300 ;
		double result = 300 ;
		
		assertEquals(result,c1.abs(x));
	
	}
	@Test
	void test3()  {
	
		double x = 0;
		double result = 0;
	try {
		assertEquals(result,c1.abs(x));
	}
	catch (IllegalArgumentException e) {
//		fail("failed");
		System.out.print(e);
	}
	
	}
	
	
	@Test
	void test4() {
		

		double x = -10;
		double result = 10 ;
		
		assertEquals(result,c1.abs(x));
	}
	@Test 
	void test5()  {
		
		String x ="Aksh";
//		double y =1;
		double result = 2;
		try {
		assertEquals(result,c1.abs(x));
			}
		catch (IllegalArgumentException e){
//			fail("Failed");
			System.out.print(e);
		}
		
		}
	
}
