package fibonacciTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import fibonacci.Fibonacci;

public class FibonacciTest {
  @Test
  public void fibSuccess() {
	  
	  int n = 10;
	  int fibo = Fibonacci.fibonacciRecursion(n);
	  
	  Assert.assertEquals(fibo, 89);
  }
  
  @Test
  public void fibFail() {
	  
	  int n = 10;
	  int fibo = Fibonacci.fibonacciRecursion(n);
	  
	  Assert.assertNotEquals(fibo, 55);
  }
  
  @Test
  public void dynamicFib() {
	  
	  int fib = Fibonacci.fibonacciDynamic(1000);
	  Assert.assertEquals(fib, 1597);
  }
  
  /*
  @Test
  public void dynamicFail() {
	  
	  int fib2 = Fibonacci.fibonacciDynamic(1000);
	  Assert.assertNotEquals(fib2, 987);
  }
  */
}
