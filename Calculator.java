
public class Calculator <T>{

	public Calculator () {
		
		
	}
	
	public<T>  double add(T x, T y) {
		
		if (x instanceof Double && y instanceof Double) {

			return ((double)x) + ((double) y);
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
		
	}	
	
	@SuppressWarnings("hiding")
	public <T> double sub(T x, T y) {
		if (x instanceof Double && y instanceof Double) {

			return ((double)x) - ((double) y);
			
		}
		
		else throw  new IllegalArgumentException("Im-porper input value");
	}	

	public <T> double div(T x, T y) {
		
		if (x instanceof Double && y instanceof Double) {

			if (((Double)y)==0) {
				
				throw new IllegalArgumentException("Division by zero");
				
			} else
			 return ((Double) x)/ ((Double) y);	
		}		
		else throw  new IllegalArgumentException("Im-porper input value");
	
	}	
	public <T> double multiply(T x, T y) {
		
		if (x instanceof Double && y instanceof Double) {
			if ( ((double)x)== 0 || ((double)y) ==0  ) {
			return 0;
			}
			else return  ((double)x) * ((double) y);
		}
		
		else throw  new IllegalArgumentException("Im-porper input value");
	}	
	
	public<T>  double square(T x) {
		if (x instanceof Double ) {

			return ((double)x) * ((double) x);
		}
		else throw  new IllegalArgumentException("Im-porper input value");
	}	
	
	public <T>  double square_root(T x) {
		if (x instanceof Double ) {
			if ((Double)x < 0 ) {
				throw  new IllegalArgumentException("No negative values for root function");
			}
			else return Math.sqrt(((double)x));
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
	
	}	
	public<T> double negate(T x) {
		
		if (x instanceof Double ) {
			if ((Double)x == 0) {
				
				throw new IllegalArgumentException("Zero is niether even nor odd");
			}
			else
			return -((double)x);
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
		
	}	
	public <T> double percentage(T x, T y) {
		
		if (x instanceof Double && y instanceof Double ) {
			
			if ((Double)y == 0) {
				
				throw new IllegalArgumentException("You can find percentage of 0 value");
			}
			else return (((Double) x)/ ((Double) y))* 100;
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
		
	}	
	public <T> double abs(T x) {
		
		if (x instanceof Double  ) {
			
			 return Math.abs(((Double) x));
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
		
	}
  public <T> double power(T x, T y) {
		
		if (x instanceof Double && y instanceof Double  ) {
			
			 return Math.pow(((Double) x), ((Double) y));
			
		}
		else throw  new IllegalArgumentException("Im-porper input value");
		
	}
}
