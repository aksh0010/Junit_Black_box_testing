import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase5<T>{
	
	private final Calculator<T> c1= new Calculator<>( );	
	
	
	@Test
	void test1()  {
		
		double x = 12;
		double result = 144;
		
		assertEquals(result,c1.square(x));
	}

	@Test
	void test2() {
		

		double x = 300 ;
		double result = 90000 ;
		
		assertEquals(result,c1.square(x));
	
	}
	@Test
	void test3()  {
	
		double x = 0;
		double result = 0;
	
		assertEquals(result,c1.square(x));
	}
	
	
	@Test
	void test4() {
		

		double x = -10;
		double result = 100 ;
		
		assertEquals(result,c1.square(x));
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
