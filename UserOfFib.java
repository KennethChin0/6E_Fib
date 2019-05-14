/**
  test Fib methods, in response to command line input

  java UserOfFib @method @index
  where @method is one of
      recurrence
      grade8
      Binet
   and @index is the index of the desired Fibonacci number

   For example
          java UserOfFib recurrence 7
    should produce 13
 */

public class UserOfFib {
    public static void main(String[] commandLine) {
        System.out.println(Math.pow(5,1/2.0) / 2);

        String method = commandLine[0];
        int seek = Integer.valueOf( commandLine[1]);

        System.out.println( "using method " + method
                          + " seeking F_" + seek);

        if(  method.equals( "recurrence"))
            System.out.println( "Fib " + Fib.fib_recurrence( seek));
        else if( method.equals( "grade8" ))
            System.out.println( "Fib " + Fib.fib_grade8( seek));
        else if( method.equals( "Binet"))
            System.out.println( "Fib " + Fib.fib_Binet( seek));

        else System.out.println(  "invalid method on the command line");
    }
}
