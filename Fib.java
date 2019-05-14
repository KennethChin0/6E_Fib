/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 0) //base case
            return 0; //instructions for base case
        if (n == 1)  //base case
            return 1; //instructions for base case
        else return fib_recurrence(n-1) /* recursive abstraction */ + /*combiner*/ fib_recurrence (n -2); // recursive abstraction
    }
     /* These are class / instance methods because you aren't creating any instances of Fib in the UserOfFib. There for these shouldn't be instance methods
     but they should be class methods. You are using data from user input so you would make them a class method.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      int first = 0;
      int second = 1;
      while (n > 1) {
        int temp = second;
        second += first;
        first = temp;
        n--;
      }
      if (n == 0) return first;
      return second;
    }
    /* Time complexity:
       Consider the size of the problem to be dependent on the size of n.

       As the proxy for the time required, count using addition

       Then cost of the the recurrence algorithm
       grows linearyly
       as the size of the problem increases,
       because the while loop will run + 1 times for each value of n that is +1.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = ((1 + Math.pow(5,1/2.0)) / 2);
        double psi = ((1 - Math.pow(5,1/2.0)) / 2);

        return (Math.pow(phi, n) - Math.pow(psi, n)) / Math.pow(5,1/2.0); // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be Constant

       As the proxy for the time required, count nothing, it is constant

       Then cost of the the recurrence algorithm
       doesnt grow
       as the size of the problem increases,
       because there is not loops to be executed. The method uses along arthimetic equations therefore the cost will
       be the same no matter how large the problem is.
     */
}
